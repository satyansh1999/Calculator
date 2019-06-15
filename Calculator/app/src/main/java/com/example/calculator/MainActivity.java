package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button n1, n2, n3, n4, n5, n6, n7, n8, n9, n0, div, mul, add, sub,clear,delete,equal,dot,copy,m_plus,m_minus,mr,mc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextView screen = findViewById(R.id.screen);      // User inputs in this field
        screen.setMovementMethod(new ScrollingMovementMethod());
        final TextView mem = findViewById(R.id.mem);        // this displays the value stored using memory funct
        mem.setMovementMethod(new ScrollingMovementMethod());
        final TextView equation = findViewById(R.id.equation);      // this displays the equation whose value is calculated
        equation.setMovementMethod(new ScrollingMovementMethod());

        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        n3 = findViewById(R.id.n3);
        n4 = findViewById(R.id.n4);
        n5 = findViewById(R.id.n5);
        n6 = findViewById(R.id.n6);
        n7 = findViewById(R.id.n7);
        n8 = findViewById(R.id.n8);
        n9 = findViewById(R.id.n9);
        n0 = findViewById(R.id.n0);
        dot = findViewById(R.id.dot);

        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        sub = findViewById(R.id.sub);
        add = findViewById(R.id.add);

        clear = findViewById(R.id.clear);
        delete = findViewById(R.id.del);
        equal = findViewById(R.id.equal);
        copy = findViewById(R.id.copy);

        mr = findViewById(R.id.mr);
        m_plus = findViewById((R.id.m_plus));
        m_minus = findViewById(R.id.m_minus);
        mc = findViewById(R.id.mc);


        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {       // append is a user defined function which appends text in a text view

                String str = screen.getText().toString();
                if (str.equals("0")) {
                    screen.setText("1");
                } else {
                    screen.setText(Append(str, "1"));
                }

            }
        });

        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str = screen.getText().toString();
                if (str.equals("0")) {
                    screen.setText("2");
                } else {
                    screen.setText(Append(str, "2"));
                }

            }
        });

        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str = screen.getText().toString();
                if (str.equals("0")) {
                    screen.setText("3");
                } else {
                    screen.setText(Append(str, "3"));
                }

            }
        });

        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str = screen.getText().toString();
                if (str.equals("0")) {
                    screen.setText("4");
                } else {
                    screen.setText(Append(str, "4"));
                }

            }
        });

        n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str = screen.getText().toString();
                if (str.equals("0")) {
                    screen.setText("5");
                } else {
                    screen.setText(Append(str, "5"));
                }

            }
        });

        n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str = screen.getText().toString();
                if (str.equals("0")) {
                    screen.setText("6");
                } else {
                    screen.setText(Append(str, "6"));
                }

            }
        });

        n7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str = screen.getText().toString();
                if (str.equals("0")) {
                    screen.setText("7");
                } else {
                    screen.setText(Append(str, "7"));
                }

            }
        });

        n8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str = screen.getText().toString();
                if (str.equals("0")) {
                    screen.setText("8");
                } else {
                    screen.setText(Append(str, "8"));
                }

            }
        });

        n9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str = screen.getText().toString();
                if (str.equals("0")) {
                    screen.setText("9");
                } else {
                    screen.setText(Append(str, "9"));
                }

            }
        });

        n0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str = screen.getText().toString();
                if (str.equals("0")) {
                    screen.setText("0");
                } else {
                    screen.setText(Append(str, "0"));
                }

            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str = screen.getText().toString();
                if (str.equals("0")) {
                    screen.setText(".");
                } else {
                    screen.setText(Append(str, "."));
                }

            }
        });


        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                screen.setText("0");
                equation.setText("0");

            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {   // delete is a user defined function

                String s = screen.getText().toString();
                String str = Delete(s);
                if (s.equals("0") | s.equals("1") | s.equals("2") | s.equals("3") | s.equals("4") | s.equals("5") | s.equals("6") | s.equals("7") | s.equals("8") | s.equals("9") | s.equals("*") | s.equals("/") | s.equals("-") | s.equals("+") | s.equals(".")) {
                    screen.setText("0");
                } else
                    screen.setText(str);

            }
        });

        copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                screen.setText(equation.getText());
                equation.setText("0");
            }
        });


        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str = screen.getText().toString();
                if (str.equals("0")) {
                    screen.setText("/");
                } else {
                    screen.setText(Append(str, "/"));
                }

            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str = screen.getText().toString();
                if (str.equals("0")) {
                    screen.setText("*");
                } else {
                    screen.setText(Append(str, "*"));
                }

            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str = screen.getText().toString();
                if (str.equals("0")) {
                    screen.setText("-");
                } else {
                    screen.setText(Append(str, "-"));
                }

            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str = screen.getText().toString();
                if (str.equals("0")) {
                    screen.setText("+");
                } else {
                    screen.setText(Append(str, "+"));
                }

            }
        });


        mr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(mem.getText().toString());
            }
        });

        mc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mem.setText("0");
            }
        });

        m_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1 = screen.getText().toString();            // calculate is a user defined function which calculates the value of equation entered as string
                String str = calculate(str1);
                if (str.equals("!+") | str.equals("!!") | str.equals("!!!") | str.equals("!!!!") | str.equals("!!!!!"))   // calculate function returns exclamatory marks if it gets an invalid input
                {
                    Toast error = Toast.makeText(getApplicationContext(), "enter a valid value", Toast.LENGTH_LONG);
                    error.show();
                }
                else
                {
                    float a = Float.parseFloat(calculate(str1));
                    if (a >= 0) {
                        mem.setText(calculate(Append(Append(mem.getText().toString(), "+"), screen.getText().toString())));
                    }
                    if (a < 0) {
                        mem.setText(calculate(Append(Append(mem.getText().toString(), "-"), screen.getText().toString().substring(1))));
                    }
                    screen.setText("0");
                }
            }
        });

        m_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1 = screen.getText().toString();
                String str = calculate(str1);
                if (str.equals("!+") | str.equals("!!") | str.equals("!!!") | str.equals("!!!!") | str.equals("!!!!!")) {
                    Toast error = Toast.makeText(getApplicationContext(), "enter a valid value", Toast.LENGTH_LONG);
                    error.show();
                } else {
                    float a = Float.parseFloat(calculate(str1));
                    if (a >= 0) {
                        mem.setText(calculate(Append(Append(mem.getText().toString(), "-"), screen.getText().toString())));
                    }
                    if (a < 0) {
                        mem.setText(calculate(Append(Append(mem.getText().toString(), "+"), screen.getText().toString().substring(1))));
                    }
                    screen.setText("0");
                }
            }
        });


        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str = screen.getText().toString();
                int n = str.length();
                equation.setText(str);
                char a = str.charAt(0);
                char b = str.charAt(1);
                String str1 = calculate(str);

                if (n == 1) {
                    if (str.equals("*") | str.equals("-") | str.equals("+") | str.equals("/")) {
                        Toast error = Toast.makeText(getApplicationContext(), "operator cannot be the only character entered", Toast.LENGTH_LONG);
                        error.show();
                    } else if (str.equals("."))
                        screen.setText("0");
                    else
                        screen.setText(str);
                }

                else if (str1.equals("!+"))      // calculate is a user defined function which calculates the value of equation entered as string
                {
                    Toast error = Toast.makeText(getApplicationContext(), "operator cannot be the only character entered", Toast.LENGTH_LONG);
                    error.show();
                } else if (str1.equals("!!")) {
                    Toast error = Toast.makeText(getApplicationContext(), "First character cannot be an operator", Toast.LENGTH_LONG);
                    error.show();
                } else if (str1.equals("!!!")) {
                    Toast error = Toast.makeText(getApplicationContext(), "equation cannot end with an operator", Toast.LENGTH_LONG);
                    error.show();
                } else if (str1.equals("!!!!")) {
                    Toast error = Toast.makeText(getApplicationContext(), "Two or more operators cannot occur one after the other", Toast.LENGTH_LONG);
                    error.show();
                } else if (str1.equals("!!!!!")) {
                    Toast error = Toast.makeText(getApplicationContext(), "A number cannot have 2 or more decimal points", Toast.LENGTH_LONG);
                    error.show();
                } else if (a == '+')      // if + sign is entered in the beginning just the value of follwing string equation is calculated as it doesn't have any effect on the value calculated
                {
                    if (b != '+' && b != '-' && b != '*' && b != '/' && b != '.') {
                        screen.setText(calculate(str.substring(1)));
                    }
                } else             // calculate is a user defined function which calculates the value of equation entered as string
                {
                    screen.setText(calculate(str));
                }


                // this was the code that I wrote in the beginning but then created a calculate function to use it in the memory functions






/*
                int check=1;
                String str = screen.getText().toString();
                int n = str.length();
                char arr[] = str.toCharArray();


                float num[]=new float[100];
                char op[] = new char[50];
                for( int i=0 ; i<50 ; i++)
                {
                    op[i]='0';
                }

                for( int i=0 ; i<100 ; i++)
                {
                    num[i]= (float) 0.0;
                }


                equation.setText(str);
                if(n==1)
                {
                    if( arr[0] == '+' | arr[0] == '-' | arr[0] == '*' | arr[0] == '/')
                    {
                        Toast error = Toast.makeText(getApplicationContext(), "operator cannot be the only character entered", Toast.LENGTH_LONG);
                        error.show();
                        check=0;
                    }
                    else if(arr[0] == '.')
                    {
                        screen.setText("0");
                        check=0;
                        flag=0;
                    }
                    else
                    {
                        screen.setText("" + arr[0]);
                        flag=0;
                        check=0;
                    }
                }

                else if( arr[0] == '*' | arr[0] == '/')
                {
                    Toast error = Toast.makeText(getApplicationContext(), "First character cannot be an operator", Toast.LENGTH_LONG);
                    error.show();
                    check=0;
                }

                else if( arr[n-1] == '+'  |  arr[n-1] == '/'  |  arr[n-1] == '*' |  arr[n-1] == '-' )
                {
                    Toast error = Toast.makeText(getApplicationContext(), "equation cannot end with an operator", Toast.LENGTH_LONG);
                    error.show();
                    check=0;
                }
                else
                {
                    for(int i=0 ; i < n-1 ; i++ )
                    {
                        if (arr[i] == '+' | arr[i] == '/' | arr[i] == '*' | arr[i] == '-') {
                            if (arr[i + 1] == '+' | arr[i + 1] == '/' | arr[i + 1] == '*' | arr[i + 1] == '-') {
                                Toast error = Toast.makeText(getApplicationContext(), "Two or more operators cannot occur one after the other", Toast.LENGTH_LONG);
                                error.show();
                                check = 0;
                                break;
                            }
                        } else if (arr[i] == '.' && arr[i + 1] == '.') {
                            Toast error = Toast.makeText(getApplicationContext(), "A number cannot contain two decimal points", Toast.LENGTH_LONG);
                            error.show();
                            check = 0;
                            break;
                        }
                    }

                    int decimal = 0;
                    for(int i=0;i<n;i++)
                    {
                        if (arr[i] == '.' && decimal != 0)
                        {
                            Toast error = Toast.makeText(getApplicationContext(), "A number cannot contain two decimal points", Toast.LENGTH_LONG);
                            error.show();
                            check = 0;
                            break;
                        }
                        else if(arr[i] == '.' && decimal == 0)
                            decimal++;
                        else if(arr[i] == '+' | arr[i] == '/' | arr[i] == '*' | arr[i] == '-')
                            decimal=0;
                    }
                }

                if(check != 0)
                {
                    int start=0,end;
                    int size_num=1,size_op = 2;

                    op[0]='+';  //initialise first operator to be zero
                    if(arr[0] == '-')
                    {
                        size_op = 0;
                    }

                    for(int i=0;i<n;i++)    //position of operators
                    {
                        if(arr[i] == '+'  |  arr[i] == '/'  |  arr[i] == '*' |  arr[i] == '-')
                        {
                            op[size_op] = arr[i];
                            size_op= size_op + 2;
                        }
                    }



                    for(int i=0 ; i<n ; i++)    // getting numbers between operators
                    {
                        if(i==0) {
                            if (arr[0] == '+' | arr[0] == '-') {
                                start = 1;
                                continue;
                            }
                        }
                        if(arr[i] == '+'  |  arr[i] == '/'  |  arr[i] == '*' |  arr[i] == '-' )
                        {
                            end = i;
                            String str1 = str.substring(start,end);
                            num[size_num]=Float.parseFloat(str1);
                            size_num = size_num + 2;
                            start = i+1;
                        }
                        if( i == n-1 )
                        {
                            String str1 = str.substring(start,n);
                            num[size_num]=Float.parseFloat(str1);
                            size_num = size_num + 2;
                        }
                    }


                    for(int i=0 ; i<size_op ; i=i+2)
                    {
                        if(op[i] == '-')
                        {
                            num[i+1] = num[i+1] * (-1);
                            op[i] = '+';
                        }
                    }

                    for(int i=2 ; i<size_op ; i=i+2)
                    {
                        if(op[i] == '/')
                        {
                            num[i-1] = num[i-1] / num[i+1];
                            for(int j=i+3 ; j<size_num ; j=j+2)
                            {
                                num[j-2] = num[j];
                            }

                            for(int j=i+2 ; j<size_op ; j=j+2)
                            {
                                op[j-2] = op[j];
                            }
                            i = i-2;
                            size_op = size_op - 2;
                            size_num = size_num - 2;
                        }

                    }

                    for(int i=2 ; i<size_op ; i=i+2)
                    {
                        if(op[i] == '*')
                        {
                            num[i-1] = num[i-1] * num[i+1];
                            for(int j=i+3 ; j<size_num ; j=j+2)
                            {
                                num[j-2] = num[j];
                            }

                            for(int j=i+2 ; j<size_op ; j=j+2)
                            {
                                op[j-2] = op[j];
                            }
                            i = i-2;
                            size_op = size_op - 2;
                            size_num = size_num - 2;
                        }

                    }

                    for(int i=2 ; i<size_op ; i=i+2)
                    {
                        if(op[i] == '+')
                        {
                            num[i-1] = num[i-1] + num[i+1];
                            for(int j=i+3 ; j<size_num ; j=j+2)
                            {
                                num[j-2] = num[j];
                            }

                            for(int j=i+2 ; j<size_op ; j=j+2)
                            {
                                op[j-2] = op[j];
                            }
                            i = i-2;
                            size_op = size_op - 2;
                            size_num = size_num - 2;
                        }

                    }

                    screen.setText(""+num[1]);

                }


*/

            }
        });


    }







        // following are the functions used in the whole program



    protected static String Append(String str1, String str2) {
        return str1.concat(str2);
    }

    //Delete function used to delete last character
    protected static String Delete(String str) {
        int n = str.length();
        return str.substring(0, n - 1);
    }

    protected static String calculate(String str)
    {
        int n = str.length();
        char[] arr = str.toCharArray();

        double[] num=new double[100];       // stores numbers obtained from the equation in given order
        char[] op = new char[50];           // stores the operator in a given order
        for( int i=0 ; i<50 ; i++)      //initialisation
        {
            op[i]='0';
        }

        for( int i=0 ; i<100 ; i++)     //initialisation
        {
            num[i]= 0.0;
        }

        if(n == 0 )             // screen is empty although it can't be as i have coded so that ther is always zero on the screen if user deletes or clears all data
    {
        return "0";
    }
        else if( n == 1 )                    // if only one character is entered
        {
            if( arr[0] == '+' | arr[0] == '-' | arr[0] == '*' | arr[0] == '/')      // it cant be an operator
            {
                return "!+";
            }
            else if(arr[0] == '.')              // if its a decimal point then return 0
            {
                return "0";
            }
            else                                // if its a number then it returns the number itself
            {
                return (str);
            }
        }

        else if( arr[0] == '*' | arr[0] == '/')     // eqn can't start with a * or / operator
        {
            return "!!";
        }

        else if( arr[n-1] == '+'  |  arr[n-1] == '/'  |  arr[n-1] == '*' |  arr[n-1] == '-' )   //eqn cant end with an operator
        {
            return "!!!";
        }
        else
        {
            for(int i=0 ; i < n-1 ; i++ )
            {
                if (arr[i] == '+' | arr[i] == '/' | arr[i] == '*' | arr[i] == '-') {        // if two operators occur together
                    if (arr[i + 1] == '+' | arr[i + 1] == '/' | arr[i + 1] == '*' | arr[i + 1] == '-') {
                        return "!!!!";
                    }
                }
                else if (arr[i] == '.' && arr[i + 1] == '.') {      // if 2 decimals occur together
                    return "!!!!!";
                }
            }

            int decimal = 0;    // keeps count of decimals encountered in a number
            for(int i=0;i<n;i++)
            {
                if (arr[i] == '.' && decimal != 0)
                {
                    return "!!!!!";
                }
                else if(arr[i] == '.' && decimal == 0)
                    decimal++;
                else if(arr[i] == '+' | arr[i] == '/' | arr[i] == '*' | arr[i] == '-')
                    decimal=0;
            }
        }

            int start=0,end;        // represtent the starting and ending index of a number the string
            int size_num=1,size_op = 2;     // size of arrays

            op[0]='+';  //initialise first operator to be zero
            if(arr[0] == '-')
            {
                size_op = 0;
            }

            for(int i=0;i<n;i++)    //getting the order  of operators
            {
                if(arr[i] == '+'  |  arr[i] == '/'  |  arr[i] == '*' |  arr[i] == '-')
                {
                    op[size_op] = arr[i];
                    size_op= size_op + 2;   // op[] array has operators at index 0,2,4,6,8.....
                }
            }



            for(int i=0 ; i<n ; i++)    // getting numbers between operators
            {
                if(i==0) {
                    if (arr[0] == '+' | arr[0] == '-') {        // string begins with an operator then it is not saved in number array so begin with index 1
                        start = 1;
                        continue;
                    }
                }
                if(arr[i] == '+'  |  arr[i] == '/'  |  arr[i] == '*' |  arr[i] == '-' )
                {
                    end = i;        // number ends when an operator is entered
                    String str1 = str.substring(start,end);
                    num[size_num]=Double.parseDouble(str1);     // convert substring to double or float value
                    size_num = size_num + 2;        // num[] array stores numbers at index 1,3,5,7,9,.....
                    start = i+1;
                }
                if( i == n-1 )      // in the end of string the end of number would be the last char entered in the string
                {
                    String str1 = str.substring(start,n);
                    num[size_num]=Double.parseDouble(str1);
                    size_num = size_num + 2;
                }
            }


            for(int i=0 ; i<size_op ; i=i+2)
            {
                if(op[i] == '-')        // store all the numbers foolowing - sign as negative numbers and replace - before them to be +
                {                       // Eg.  -3+2*3-4   =   +(-3) + 2*3 +(-4)
                    num[i+1] = -num[i+1];
                    op[i] = '+';
                }
            }

            for(int i=2 ; i<size_op ; i=i+2)        // first calculate the division operator
            {
                if(op[i] == '/')
                {
                    num[i-1] = num[i-1] / num[i+1];
                    for(int j=i+3 ; j<size_num ; j=j+2)     // contract the number array ACCORDINGLY
                    {
                        num[j-2] = num[j];
                    }

                    for(int j=i+2 ; j<size_op ; j=j+2)         // contract the operator array accordingly
                    {
                        op[j-2] = op[j];
                    }
                    i = i-2;
                    size_op = size_op - 2;  // size of both arrays decreases
                    size_num = size_num - 2;
                }

            }

            for(int i=2 ; i<size_op ; i=i+2)        // next calculate the multiply function
            {
                if(op[i] == '*')
                {
                    num[i-1] = num[i-1] * num[i+1];
                    for(int j=i+3 ; j<size_num ; j=j+2)
                    {
                        num[j-2] = num[j];
                    }

                    for(int j=i+2 ; j<size_op ; j=j+2)
                    {
                        op[j-2] = op[j];
                    }
                    i = i-2;
                    size_op = size_op - 2;
                    size_num = size_num - 2;
                }

            }

            for(int i=2 ; i<size_op ; i=i+2)    // now calculate the addition function
            {
                if(op[i] == '+')
                {
                    num[i-1] = num[i-1] + num[i+1];
                    for(int j=i+3 ; j<size_num ; j=j+2)
                    {
                        num[j-2] = num[j];
                    }

                    for(int j=i+2 ; j<size_op ; j=j+2)
                    {
                        op[j-2] = op[j];
                    }
                    i = i-2;
                    size_op = size_op - 2;
                    size_num = size_num - 2;
                }
            }

            // since we have converted the  - sign to positive we don't need to calculate the subtraction function
            return ""+num[1];    //the num[] array contracts to a single number whis the final answer. Return this number
    }
}
