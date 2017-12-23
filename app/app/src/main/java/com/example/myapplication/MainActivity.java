package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.text.DecimalFormat;


// Edit by Hbu_David 2017.6.15
// Upgrade to Android Studio 3.0.1 ,Gradle 4.1 ,David 2017.11.24

public class MainActivity extends AppCompatActivity {
    //变量定义
    private EditText editText;
    private String operator="",s="";            //操作符：记录 + - * / 符号
    private double n1 , n2 ,Result;     //操作数：操作符两端的数字，n1为左操作数，n2为右操作数。
    private TextView textView;          //文本框：显示计算过程和计算结果
    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18,btn19;   //按钮：十个数字
    private boolean aBoolean =true;

    private View.OnClickListener lisenter = new View.OnClickListener() {//侦听器
        @Override
        public void onClick(View view) {//点击事件
            editText = (EditText)findViewById(R.id.editviewdavid);//与XML中定义好的EditText控件绑定
            textView = (TextView)findViewById(R.id.textviewdavid);//与XML中定义好的TextView控件绑定
            editText.setCursorVisible(false);//隐藏输入框光标
            String str;
            Button button = (Button)view;   //把点击获得的id信息传递给button
            DecimalFormat MyFormat = new DecimalFormat("###.##");//控制Double转为String的格式

            try{
                switch(button.getId())//获取点击按钮的ID，通过ID选择对应的选项执行
                {
                    case R.id.button1://如果点击了按钮：“1”
                    {   if(!aBoolean)
                        {
                            editText.setText("");
                            textView.setText("");
                            aBoolean=true;
                        }
                        editText.setText(editText.getText().toString() + 1);//输入框末尾，添加一个“1”
                        break;
                    }
                    case R.id.button2://2
                    {
                        if(!aBoolean)
                        {
                            editText.setText("");
                            textView.setText("");
                            aBoolean=true;
                        }
                        editText.setText(editText.getText().toString() + 2);
                        break;
                    }
                    case R.id.button3://3
                    {   if(!aBoolean)
                    {
                        editText.setText("");
                        textView.setText("");
                        aBoolean=true;
                    }
                        editText.setText(editText.getText().toString() + 3);
                        break;
                    }
                    case R.id.button4://4
                    {   if(!aBoolean)
                    {
                        editText.setText("");
                        textView.setText("");
                        aBoolean=true;
                    }
                        editText.setText(editText.getText().toString() + + 4);
                        break;
                    }
                    case R.id.button5://5
                    {   if(!aBoolean)
                    {
                        editText.setText("");
                        textView.setText("");
                        aBoolean=true;
                    }
                        editText.setText(editText.getText().toString() + 5);
                        break;
                    }
                    case R.id.button6://6
                    {   if(!aBoolean)
                    {
                        editText.setText("");
                        textView.setText("");
                        aBoolean=true;
                    }
                        editText.setText(editText.getText().toString() +  6);
                        break;
                    }
                    case R.id.button7://7
                    {   if(!aBoolean)
                    {
                        editText.setText("");
                        textView.setText("");
                        aBoolean=true;
                    }
                        editText.setText(editText.getText().toString() +  7);
                        break;
                    }
                    case R.id.button8://8
                    {   if(!aBoolean)
                    {
                        editText.setText("");
                        textView.setText("");
                        aBoolean=true;
                    }
                        editText.setText(editText.getText().toString() +   8);
                        break;
                    }
                    case R.id.button9://9
                    {   if(!aBoolean)
                    {
                        editText.setText("");
                        textView.setText("");
                        aBoolean=true;
                    }

                        editText.setText(editText.getText().toString() +  9);
                        break;
                    }
                    case R.id.button0://0
                    {   if(!aBoolean)
                    {
                        editText.setText("");
                        textView.setText("");
                        aBoolean=true;
                    }
                        str = editText.getText().toString();
                        //此处可以考虑添加代码，限制用户输入00,000等 2017.6.15
                        editText.setText(str + 0);
                        break;
                    }
                    case R.id.buttonqing://Clear
                    {
                        editText.setText("");
                        textView.setText("");
                        s="";
                        Result = 0;
                        operator="";
                        n1=0;
                        n2=0;
                        break;
                    }
                    case R.id.buttontui:
                    {
                        editText.setText(editText.getText().toString().substring(0,editText.getText().toString().length()-1));
                        break;
                    }
                    case R.id.buttonbian:
                        if(!aBoolean)
                        {
                            editText.setText(editText.getText().toString().subSequence(1, editText.getText().toString().length()));
                            textView.setText("");
                            aBoolean=true;
                        }
                    {   if(editText.getText().toString().subSequence(0, 1).equals("-"))
                        {
                            editText.setText(editText.getText().toString().substring(1,editText.getText().toString().length()));
                        }
                        else
                        {
                            editText.setText("-"+editText.getText().toString());
                        }

                        break;
                    }
                    case R.id.buttondian://.
                    {
                        if(!aBoolean)
                        {
                            editText.setText(editText.getText().toString().subSequence(1, editText.getText().toString().length()));
                            textView.setText("");
                            aBoolean=true;
                        }
                        str = editText.getText().toString();
                        if(str.indexOf(".") != -1) //判断字符串中是否已包含小数点，如果有，就什么也不做
                        {}
                        else //如果没有小数点
                        {
                            if(str.equals("0"))//如果开始为0
                                editText.setText(("0" + ".").toString());
                            else if(str.equals(""))//如果初时显示为空，就什么也不做
                            {}
                            else
                                editText.setText(str + ".");
                        }
                        break;
                    }
                    case R.id.buttonjia://操作符+
                    {
                        if(!aBoolean)
                        {
                            editText.setText(editText.getText().toString().subSequence(1, editText.getText().toString().length()));
                            textView.setText("");
                            aBoolean=true;
                        }
                        if(s=="")
                        {
                            str = editText.getText().toString();
                            n1 = Double.parseDouble(str);
                        }
                        else
                        {
                            n1=Double.parseDouble(s);
                        }
                        if(operator=="")
                        {
                            operator = "+";
                            s=editText.getText().toString();
                            textView.setText(editText.getText().toString() + operator);
                            editText.setText("");
                        }
                        else
                        {
                            if(operator == "+")
                            {
                                str = editText.getText().toString();
                                n2 = Double.parseDouble(str);
                                Result = n1 + n2;
                                operator = "+";
                                s=MyFormat.format(Result);
                                textView.setText(textView.getText().toString() +editText.getText().toString() + operator  );
                                editText.setText("");
                            }
                            else if(operator == "-")
                            {
                                str = editText.getText().toString();
                                n2 = Double.parseDouble(str);
                                Result = n1 - n2;
                                operator = "+";
                                s=MyFormat.format(Result);
                                textView.setText(textView.getText().toString() +editText.getText().toString() + operator  );
                                editText.setText("");
                            }
                            else if(operator == "×")
                            {
                                str = editText.getText().toString();
                                n2 = Double.parseDouble(str);
                                Result = n1 * n2;
                                operator = "+";
                                s=MyFormat.format(Result);
                                textView.setText(textView.getText().toString() +editText.getText().toString() + operator  );
                                editText.setText("");
                            }
                            else if(operator == "÷")
                            {
                                operator = "+";
                                str = editText.getText().toString();
                                n2 = Double.parseDouble(str);
                                if(n2 == 0)
                                {
                                    editText.setText("");
                                    textView.setText("除数不能为0");
                                    break;
                                }
                                else
                                {
                                    Result = n1 / n2;
                                    s=MyFormat.format(Result);
                                    textView.setText(textView.getText().toString() +editText.getText().toString() + operator  );
                                    editText.setText("");
                                }
                            }
                        }
                        break;
                    }
                    case R.id.buttonjian://操作符-
                    {
                        if(!aBoolean)
                        {
                            editText.setText(editText.getText().toString().subSequence(1, editText.getText().toString().length()));
                            textView.setText("");
                            aBoolean=true;
                        }
                        if(s=="")
                        {
                            str = editText.getText().toString();
                            n1 = Double.parseDouble(str);
                        }
                        else
                        {
                            n1=Double.parseDouble(s);
                        }
                        if(operator=="")
                        {
                        operator = "-";
                            s=editText.getText().toString();
                            textView.setText(editText.getText().toString() + operator);
                            editText.setText("");}
                         else
                        {
                            if(operator == "+")
                            {
                                str = editText.getText().toString();
                                n2 = Double.parseDouble(str);
                                Result = n1 + n2;
                                s=MyFormat.format(Result);
                                operator = "-";
                                textView.setText(textView.getText().toString() +editText.getText().toString() + operator  );
                                editText.setText("");
                            }
                            else if(operator == "-")
                            {
                                str = editText.getText().toString();
                                n2 = Double.parseDouble(str);
                                Result = n1 - n2;
                                s=MyFormat.format(Result);
                                operator = "-";
                                textView.setText(textView.getText().toString() +editText.getText().toString() + operator  );
                                editText.setText("");
                            }
                            else if(operator == "×")
                            {
                                str = editText.getText().toString();
                                n2 = Double.parseDouble(str);
                                Result = n1 * n2;
                                s=MyFormat.format(Result);
                                operator = "-";
                                textView.setText(textView.getText().toString() +editText.getText().toString() + operator  );
                                editText.setText("");
                            }
                            else if(operator == "÷")
                            {
                                str = editText.getText().toString();
                                n2 = Double.parseDouble(str);
                                operator = "-";
                                if(n2 == 0)
                                {
                                    editText.setText("");
                                    textView.setText("除数不能为0");
                                    break;
                                }
                                else
                                {
                                    Result = n1 / n2;
                                    s=MyFormat.format(Result);
                                    textView.setText(textView.getText().toString() +editText.getText().toString() + operator  );
                                    editText.setText("");
                                }
                            }
                        }
                        break;
                    }
                    case R.id.buttoncheng://操作符*
                    {
                        if(!aBoolean)
                        {
                            editText.setText(editText.getText().toString().subSequence(1, editText.getText().toString().length()));
                            textView.setText("");
                            aBoolean=true;
                        }
                        if(s=="")
                        {
                            str = editText.getText().toString();
                            n1 = Double.parseDouble(str);
                        }
                        else
                        {
                            n1=Double.parseDouble(s);
                        }
                        if(operator=="")
                        {
                            operator = "×";
                            s=editText.getText().toString();
                            textView.setText(editText.getText().toString() + operator);
                            editText.setText("");}
                        else
                        {
                            if(operator == "+")
                            {
                                str = editText.getText().toString();
                                n2 = Double.parseDouble(str);
                                Result = n1 + n2;
                                operator = "×";
                                s=MyFormat.format(Result);
                                textView.setText(textView.getText().toString() +editText.getText().toString() + operator  );
                                editText.setText("");
                            }
                            else if(operator == "-")
                            {
                                str = editText.getText().toString();
                                n2 = Double.parseDouble(str);
                                Result = n1 - n2;
                                operator = "×";
                                s=MyFormat.format(Result);
                                textView.setText(textView.getText().toString() +editText.getText().toString() + operator  );
                                editText.setText("");
                            }
                            else if(operator == "*")
                            {
                                str = editText.getText().toString();
                                n2 = Double.parseDouble(str);
                                Result = n1 * n2;
                                operator = "×";
                                s=MyFormat.format(Result);
                                textView.setText(textView.getText().toString() +editText.getText().toString() + operator  );
                                editText.setText("");
                            }
                            else if(operator == "÷")
                            {
                                operator = "×";
                                str = editText.getText().toString();
                                n2 = Double.parseDouble(str);
                                if(n2 == 0)
                                {
                                    editText.setText("");
                                    textView.setText("除数不能为0");
                                    break;
                                }
                                else
                                {
                                    Result = n1 / n2;
                                    s=MyFormat.format(Result);
                                    textView.setText(textView.getText().toString() +editText.getText().toString() + operator  );
                                    editText.setText("");
                                }
                            }
                        }
                        break;
                    }

                    case R.id.buttonchu://操作符 /
                    {   if(!aBoolean)
                    {
                        editText.setText(editText.getText().toString().subSequence(1, editText.getText().toString().length()));
                        textView.setText("");
                        aBoolean=true;
                    }
                        if(s=="")
                        {
                            str = editText.getText().toString();
                            n1 = Double.parseDouble(str);
                        }
                        else
                        {
                            n1=Double.parseDouble(s);
                        }
                        if(operator=="")
                        {
                            operator = "÷";
                            s=editText.getText().toString();
                            textView.setText(editText.getText().toString() + operator);
                            editText.setText("");}
                        else
                        {
                            if(operator == "+")
                            {
                                str = editText.getText().toString();
                                n2 = Double.parseDouble(str);
                                Result = n1 + n2;
                                operator = "÷";
                                s=MyFormat.format(Result);
                                textView.setText(textView.getText().toString() +editText.getText().toString() + operator  );
                                editText.setText("");
                            }
                            else if(operator == "-")
                            {
                                str = editText.getText().toString();
                                n2 = Double.parseDouble(str);
                                Result = n1 - n2;
                                operator = "÷";
                                s=MyFormat.format(Result);
                                textView.setText(textView.getText().toString() +editText.getText().toString() + operator  );
                                editText.setText("");
                            }
                            else if(operator == "×")
                            {
                                str = editText.getText().toString();
                                n2 = Double.parseDouble(str);
                                Result = n1 * n2;
                                operator = "÷";
                                s=MyFormat.format(Result);
                                textView.setText(textView.getText().toString() +editText.getText().toString() + operator  );
                                editText.setText("");
                            }
                            else if(operator == "÷")
                            {
                                operator = "÷";
                                str = editText.getText().toString();
                                n2 = Double.parseDouble(str);
                                if(n2 == 0)
                                {
                                    editText.setText("");
                                    textView.setText("除数不能为0");
                                    break;
                                }
                                else
                                {
                                    Result = n1 / n2;
                                    s=MyFormat.format(Result);
                                    textView.setText(textView.getText().toString() +editText.getText().toString() + operator  );
                                    editText.setText("");
                                }
                            }
                        }
                        break;
                    }
                    case R.id.buttonEqual://操作符=
                    {
                        if(operator == "+")
                        {
                            str = editText.getText().toString();
                            n2 = Double.parseDouble(str);
                            n1=Double.parseDouble(s);
                            Result = n1 + n2;
                            textView.setText(textView.getText().toString()  + editText.getText().toString()  );
                            editText.setText("=" +MyFormat.format(Result)+"");
                            operator="";
                            s="";


                        }
                        else if(operator == "-")
                        {
                            str = editText.getText().toString();
                            n2 = Double.parseDouble(str);
                            n1=Double.parseDouble(s);
                            Result = n1 - n2;
                            textView.setText(textView.getText().toString()  + editText.getText().toString()   );
                            editText.setText("=" +MyFormat.format(Result)+"");
                            operator="";
                            s="";
                        }
                        else if(operator == "×")
                        {
                            str = editText.getText().toString();
                            n2 = Double.parseDouble(str);
                            n1=Double.parseDouble(s);
                            Result = n1 * n2;
                            textView.setText(textView.getText().toString()  + editText.getText().toString()  );
                            editText.setText("=" +MyFormat.format(Result)+"");
                            operator="";
                            s="";
                        }
                        else if(operator == "÷")
                        {
                            str = editText.getText().toString();
                            n2 = Double.parseDouble(str);
                            n1=Double.parseDouble(s);
                            if(n2 == 0)
                            {
                                editText.setText("");
                                textView.setText("除数不能为0");
                                break;
                            }
                            else
                            {
                                Result = n1 / n2;
                                textView.setText(textView.getText().toString()  + editText.getText().toString()  );
                                editText.setText("=" +MyFormat.format(Result)+"");
                                operator="";
                                s="";
                            }
                        }
                        aBoolean=false;
                        break;
                    }
                    default:
                        break;
                }
            }catch(Exception e){}

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //获取按钮的id
        btn0 = (Button) findViewById(R.id.button0);
        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        btn5 = (Button) findViewById(R.id.button5);
        btn6 = (Button) findViewById(R.id.button6);
        btn7 = (Button) findViewById(R.id.button7);
        btn8 = (Button) findViewById(R.id.button8);
        btn9 = (Button) findViewById(R.id.button9);
        btn10 = (Button) findViewById(R.id.buttonjia);
        btn11= (Button) findViewById(R.id.buttonjian);
        btn12= (Button) findViewById(R.id.buttoncheng);
        btn13= (Button) findViewById(R.id.buttondian);
        btn14= (Button) findViewById(R.id.buttontui);
        btn15= (Button) findViewById(R.id.buttonchu);
        btn16= (Button) findViewById(R.id.buttonbian);
        btn17= (Button) findViewById(R.id.buttonqing);
        btn18= (Button) findViewById(R.id.buttonEqual);
        //为按钮添加监听器
        btn1.setOnClickListener(lisenter);
        btn2.setOnClickListener(lisenter);
        btn3.setOnClickListener(lisenter);
        btn4.setOnClickListener(lisenter);
        btn5.setOnClickListener(lisenter);
        btn6.setOnClickListener(lisenter);
        btn7.setOnClickListener(lisenter);
        btn8.setOnClickListener(lisenter);
        btn9.setOnClickListener(lisenter);
        btn0.setOnClickListener(lisenter);
        btn10.setOnClickListener(lisenter);
        btn11.setOnClickListener(lisenter);
        btn12.setOnClickListener(lisenter);
        btn13.setOnClickListener(lisenter);
        btn14.setOnClickListener(lisenter);
        btn15.setOnClickListener(lisenter);
        btn16.setOnClickListener(lisenter);
        btn17.setOnClickListener(lisenter);
        btn18.setOnClickListener(lisenter);




    }
}