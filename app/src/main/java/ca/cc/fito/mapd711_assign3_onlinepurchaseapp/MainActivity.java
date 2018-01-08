package ca.cc.fito.mapd711_assign3_onlinepurchaseapp;

/* MAPD 711 - Final Project - Online Purchase App */
/* KIDS team - 1/06/2018                          */
/* 300966930 – Aman preet kaur
   300960367 – Fernando ito
   300964037 – santhosh damodharan
   300910506 – Sergio de Almeida Brunacci         */
/* MainActivity.java                              */

import android.app.ActionBar;
import android.app.Activity;
import android.content.ContentValues;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends Activity
{
/*
    Calendar calendar;
    SimpleDateFormat simpleDateFormat;
    String Date;
*/

    private static final String tables[]={"tblCustomer","tblEmployee", "tblProduct", "tblOrder"};
    private static final String tableCreatorString[] =
            {
                    "CREATE TABLE tblCustomer (" +
                            "customer_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                            "username TEXT, " +
                            "password TEXT, " +
                            "firstname TEXT, " +
                            "lastname TEXT, " +
                            "address TEXT, " +
                            "city TEXT, " +
                            "postal_code TEXT);",
                    "CREATE TABLE tblEmployee (" +
                            "employee_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                            "username TEXT, " +
                            "password TEXT, " +
                            "firstname TEXT, " +
                            "lastname TEXT);",
                    "CREATE TABLE tblProduct (" +
                            "product_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                            "productname TEXT, " +
                            "price TEXT, " +
                            "quantity TEXT, " +
                            "category TEXT);",
                    "CREATE TABLE tblOrder (" +
                            "order_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                            "customer_id TEXT, " +
                            "product_id TEXT, " +
                            "employee_id TEXT, " +
                            "order_date TEXT, " +
                            "status TEXT);"
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final DatabaseManager db = new DatabaseManager(this);
        db.dbInitialize(tables, tableCreatorString);

/*
        //--- Add customer ---
        final String fields[] = {"customer_id", "username", "password", "firstname", "lastname", "address", "city", "postal_code"};
        final String record[] = new String[8];
*/


        //--- Add employee --- to add employee in the first time
/*        final String fields[] = {"employee_id", "username", "password", "firstname", "lastname"};
        final String record[] = new String[5];
*/
/*
        //--- Add product ---
        final String fields[] = {"product_id", "productname", "price", "quantity", "category"};
        final String record[] = new String[5];
*/
/*
        //--- Add order ---
        final String fields[] = {"order_id", "customer_id", "product_id", "employee_id", "order_date", "status"};
        final String record[] = new String[6];

        //--- Get current date and time ---
        calendar = Calendar.getInstance();
        simpleDateFormat = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
        Date =  simpleDateFormat.format(calendar.getTime());
*/

        // Handle Login button
        final Button btnLogin = (Button) findViewById(R.id.btnLogin);
        final EditText etUsername = (EditText) findViewById(R.id.etUsername);
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);
        final TextView display = (TextView) findViewById(R.id.tvDisplay);

/*
        ActionBar actionBar = getActionBar(); // or getActionBar();
        actionBar.setTitle(etUsername.toString()); // set the top title
        String title = actionBar.getTitle().toString(); // get the title
        actionBar.hide(); // or even hide the actionbar
*/

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
/*
            // Delete n records
            String txt = "";

            for (int i=3; i<17; i++) {
                txt = String.valueOf(i);
                db.deleteRecord("tblCustomer", "customer_id", txt);
            }
*/
/*
        <item>Produce: Garlic Product of China (5 count) - $0.67 - Produce</item>
        <item>Meat: Frozen Halal Turkey (1 unit) - $2.99 - Produce</item>
        <item>Bakery: Dinner Rolls (24 unit) - $1.99</item>
        <item>Bakery: Cheescake (1 unit) - $12.00V</item>
*/
/*
         // Add Product

                List table = db.getTable("tblProduct");
                record[1] = "Broccoli"; //productname
                record[2] = "1.29";    //price
                record[3] = "1 kg";      //quantity
                record[4] = "Veggie";       //category
                ContentValues values = new ContentValues();
                db.addRecord(values, "tblProduct", fields,record);
*/
/*
    <string-array name="shoppingItem">
        <item>1: Lemons Product of Spain (1 kg) - 0.50 - Produce</item>
        <item>2: Garlic Product of China (5 count) - 0.67 - Produce</item>
        <item>3: Fresh Chicken Leg Quarters (1 unit) - 7.00 - Meat</item>
        <item>4: Frozen Halal Turkey (1 unit) - 2.99 - Meat</item>
        <item>5: Dinner Rolls (24 unit) - 1.99 - Deli</item>
        <item>6: Cheescake (1 unit) - 12.00 - Deli</item>
        <item>7: Muzzarella Balls (260 g) - 2.49 - Breakfast</item>
        <item>8: Blackberries (170 g) - 2.49 - Fruit</item>
        <item>9: Green Bell Peppers (1 kg) - 4.29 - Veggie</item>

        <item>10: Broccoli (1 kg) - 1.29 - Veggie</item>
    </string-array>
*/
/*
                for (Object o : table) {
                    ArrayList row = (ArrayList)o;
                    // Writing table to log
                    String output="";
                    for (int i=0;i<row.size();i+=5)
                    {
                        output += "Product #";
                        output += row.get(i).toString() + ": ";
                        output += row.get(i+1).toString() + " (";
                        output += row.get(i+3).toString() + ") - $";
                        output += row.get(i+2).toString();
                        output += "\n";
                    }
                    display.setText(output);
                }
*/

/*
                record[1]= studentName.getText().toString();
                record[2]= programName.getText().toString();
                Log.d("Name: ", record[1]);
                //populate the row with some values
                ContentValues values = new ContentValues();
                //for (int i=1;i<record.length;i++)
                //values.put(fields[i],record[i]);
                //add the row to the database
                db.addRecord(values, "tbl_student", fields,record);
*/

/*
                //--- Add customer fields ---
                record[1] = "fito";
                record[2] = "secret";
                record[3] = "Fernando";
                record[4] = "Ito";
                record[5] = "937, Progress Ave";
                record[6] = "Scarborough, ON";
                record[7] = "M1G 3T8";
                ContentValues values = new ContentValues();
                db.addRecord(values, "tblCustomer", fields, record);
*/
/*
                //--- Add employee fields ---
                record[1] = "jdoe";
                record[2] = "secret";
                record[3] = "John";
                record[4] = "Doe";
                ContentValues values = new ContentValues();
                db.addRecord(values, "tblEmployee", fields, record);
*/
/*
                //--- Add product fields ---
                record[1] = "Broccoli"; //productname
                record[2] = "1.29"; //price
                record[3] = "1 kg"; //quantity
                record[4] = "Veggy"; //category
                ContentValues values = new ContentValues();
                db.addRecord(values, "tblProduct", fields, record);
*/
/*
                //--- Add order fields ---
                record[1] = "1"; //customer_id
                record[2] = "1"; //product_id
                record[3] = "1"; //employee_id
                record[4] = Date; //order_date
                record[5] = "In-Process"; //status
                ContentValues values = new ContentValues();
                db.addRecord(values, "tblOrder", fields, record);
*/







                String useridPref = "";
                String usernamePref = "";
                String passwordPref = "";
                String firstnamePref = "";
                String lastnamePref = "";
                String outTable = "";

                //--- Validate username, password and type of user (Customer or Employee) ---
                    List table = db.getTable("tblCustomer");

                    for (Object o : table) {
                        ArrayList row = (ArrayList) o;
                        for (int x=0; x<row.size(); x+=8) {
                            if (row.get(x+1).toString().equals(etUsername.getText().toString()) &&
                                    row.get(x+2).toString().equals(etPassword.getText().toString())) {
                                useridPref = row.get(x).toString();
                                usernamePref = row.get(x+1).toString();
                                passwordPref = row.get(x+2).toString();
                                firstnamePref = row.get(x+3).toString();
                                lastnamePref = row.get(x+4).toString();
                                outTable = "Customer";
                            }
                        }
                    }

                table = db.getTable("tblEmployee");

                for (Object o : table) {
                    ArrayList row = (ArrayList) o;
                    for (int x=0; x<row.size(); x+=5) {
                        if (row.get(x+1).toString().equals(etUsername.getText().toString()) &&
                                row.get(x+2).toString().equals(etPassword.getText().toString())) {
                            useridPref = row.get(x).toString();
                            usernamePref = row.get(x+1).toString();
                            passwordPref = row.get(x+2).toString();
                            firstnamePref = row.get(x+3).toString();
                            lastnamePref = row.get(x+4).toString();
                            outTable = "Staff";
                        }
                    }
                }

                if (usernamePref != "") {
                    //display.setText("Username: " + usernamePref + ", Password: " + passwordPref + ", Table: " + outTable);

                    // b. Customers and Clerks username will be stored in Shared Preferences after successful login.
                    SharedPreferences customerPref = getSharedPreferences(
                            "ca.cc.fito.mapd711_assign3_onlinepurchaseapp_preferences", MODE_PRIVATE);
                    SharedPreferences.Editor customerEditor = customerPref.edit();
                    customerEditor.putString("useridPref", useridPref);
                    customerEditor.putString("usernamePref", usernamePref);
                    customerEditor.putString("firstnamePref", firstnamePref);
                    customerEditor.putString("lastnamePref", lastnamePref);
                    customerEditor.commit();

                    // a. Main activity with two login options one for customers and other one for shipment clerk.
                    if (outTable == "Customer") {
                        Intent i = new Intent("ca.cc.fito.mapd711_assign3_onlinepurchaseapp.OrderActivity");
                        startActivity(i);
                    } else {
                        Intent i = new Intent("ca.cc.fito.mapd711_assign3_onlinepurchaseapp.StaffActivity");
                        startActivity(i);
                    }
                } else {
                    display.setText(
                            "Username or Password incorrect. Please try: \n" +
                                    "CUSTOMER: Username='fito', Password='secret' \n" +
                                    "EMPLOYEE: Username='jdoe', Password='secret' \n");
                }

/**/





            };
        });
    }
/*
    public void onClickLoad(View view) {
        Intent i = new Intent("ca.cc.fito.mapd711_assign3_onlinepurchaseapp.PreferencesActivity");
        startActivity(i);
    }

    public void onClickDisplay(View view) {
        SharedPreferences appPrefs = getSharedPreferences(
                "ca.cc.fito.mapd711_assign3_onlinepurchaseapp_preferences", MODE_PRIVATE);
        DisplayText(appPrefs.getString("usernamePref", ""));
    }


    public void onClickModify(View view) {
        SharedPreferences appPrefs = getSharedPreferences(
                "ca.cc.fito.mapd711_assign3_onlinepurchaseapp_preferences", MODE_PRIVATE);
        SharedPreferences.Editor prefsEditor = appPrefs.edit();
        prefsEditor.putString("editTextPref",
                ((EditText) findViewById(R.id.etUsername)).getText().toString());
        prefsEditor.commit();
    }


    private void DisplayText(String str) {
        Toast.makeText(getBaseContext(), str, Toast.LENGTH_LONG).show();
    }
*/
}

