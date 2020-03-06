package org.vvar.societyhub.dao;

import com.mysql.cj.protocol.Resultset;
import org.vvar.societyhub.beans.Bill;

import javax.xml.transform.Result;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.*;

public class BillDAO extends BaseDAO{
	private static final Map<String, Integer> categories = new HashMap<>();
	private static final String[] types = new String[]{"WATER CHARGES", "PROPERTY TAX", "ELECTRICITY CHARGES", "SINKING FUNDS", "PARKING CHARGES", "NOC", "INSURANCE", "OTHER"};
	private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-mm-yyyy");
	static {
		for(int i = 0; i < BillDAO.types.length; i++) {
			categories.put(BillDAO.types[i], val(i));
		}
	}
	private static Integer val(int i) {
		return 2+i;
	}

	private Bill billQuery(ResultSet result) throws SQLException {
		String dueDate = result.getString("due_date");
		String amount = result.getString("amount");
		String bill_num = result.getString("bill_num");
		return new Bill(dueDate, amount, bill_num);
	}
	public List<Bill> listBill(long flatId) {
		connect();
		List<Bill> ret = new ArrayList<>();

		String billListQuery = "SELECT due_date, amount, bill_num FROM maintenance_bill WHERE flat_id=" + flatId + " ORDER BY due_date DESC";
		try (var statement = connection.createStatement();
			 var result = statement.executeQuery(billListQuery)) {
			while (result.next()) {
			    var bill = billQuery(result);
				ret.add(bill);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}

		return ret;
	}
	public Bill getBillByDate(Date date, long flatId) {
	    var dateFormat = simpleDateFormat.format(date);

		String billQuery = "SELECT * FROM maintenance_bill WHERE due_date=" + dateFormat;
		Bill ret = null;
		try (var statement = connection.createStatement();
			 var result = statement.executeQuery(billQuery)) {
			if (result.next()) {
				ret = billQuery(result);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ret;
	}
//	public void addBill(Bill bill) {
//		for selWing in submittedBill.selectedWings.data:
//			getFlatIdQuery = "SELECT flat_id FROM flat WHERE wing_id=%s" % (selWing)
//			CURSOR.execute(getFlatIdQuery)
//			flats = CURSOR.fetchall()
//
//			for flat_id in flats:
//				randomBillId = randint(1,9999)
//				addBillQuery = "INSERT INTO basic_maintenance_bill VALUES  \
//				(%d, %d, '%s', %d, %d, %d, %d, %d, %d, %d,%d, '%s', NULL) \
//				" % (randomBillId, flat_id[0],submittedBill.billDate.data,submittedBill.WATER_CHARGES.data,submittedBill.PROPERTY_TAX.data,submittedBill.ELECTRICITY_CHARGES.data,submittedBill.SINKING_FUNDS.data,submittedBill.PARKING_CHARGES.data,submittedBill.NOC.data,submittedBill.INSURANCE.data,submittedBill.OTHER.data,submittedBill.dueDate.data)
//				CURSOR.execute(addBillQuery)
//				CURSOR.fetchall()
//				CONN.commit()
//			print('ADDED BILL')
//	else:
//		flash('Error bill')
//
//	return redirect(url_for('adminPage'))
//	}
}
