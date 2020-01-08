package org.vvar.societyhub.dao;

import org.vvar.societyhub.beans.Bill;
import org.vvar.societyhub.beans.Issue;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BillDAO extends BaseDAO{
//	public List<Bill> listIssues(long flatId) {
//		connect();
//		List<Bill> ret = new ArrayList<>( );
//		String issuesQuery = "SELECT issue_date, issue_desc, related FROM issues WHERE acc_name IN (SELECT acc_name FROM account WHERE flat_id=" + flatId + ") ORDER BY issue_date";
//		categories = {'WATER CHARGES':3, 'PROPERTY TAX':4, 'ELECTRICITY CHARGES':5, 'SINKING FUNDS':6, 'PARKING CHARGES':7, 'NOC':8, 'INSURANCE':9, 'OTHER':10}
//
//		billListQuery = "SELECT due_date, amount, bill_num \
//		FROM maintenance_bill \
//		WHERE flat_id='%d'\
//		ORDER BY due_date DESC" % (session['flatId'])
//
//		CURSOR.execute(billListQuery)
//		billList = CURSOR.fetchall()
//
//		if len(billList) > 0:
//		latest_bill = billList[0]
//		billList = [{'date': bill[0], 'amount': bill[1]} for bill in billList]
//
//		if len(billList) <= 0:
//		currBill = {}
//		currBill['date']    = 'N.A.'
//		currBill['entries'] = [{'category': x, 'cost': 0} for x in categories]
//		currBill['amount']  = 0
//		return render_template('user/userbillpage.html', currBill=currBill, billList=billList)
//
//
//		if len(request.args) <= 0:
//		currBillQuery = "SELECT * FROM maintenance_bill WHERE bill_num=%d" % (latest_bill[2])
//	else:
//		day   = request.args.get('dd')
//		month = request.args.get('mm')
//		year  = request.args.get('yyyy')
//
//		billDate      = '-'.join((year, month, day))
//		currBillQuery = "SELECT * FROM maintenance_bill WHERE due_date='%s'" % (billDate)
//
//
//				CURSOR.execute(currBillQuery)
//		currBillResult = CURSOR.fetchone()
//		currBill = {}
//		currBill['date'] = currBillResult[11]
//		currBill['entries'] = [ { 'category' : x, 'cost' : float(currBillResult[categories[x]])} for x in categories]
//		currBill['amount'] = currBillResult[12]
//
//		try(var statement = connection.createStatement();
//		    var resultSet = statement.executeQuery(issuesQuery)) {
//			while(resultSet.next()) {
//				String date = resultSet.getString("issue_date");
//				String desc = resultSet.getString("issue_desc");
//				String related = resultSet.getString("related");
//				ret.add(new Issue(date,desc,related));
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return ret;
//	}
}
