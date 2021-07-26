package ca.calci12;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


class MainActivity extends Activity{

    Button button0 ,button1 ,button2 ,button3 ,button4 ,button5 ,button6,
            button7 , button8 , button9 , buttonAdd , buttonSub , buttonDivision ,
            buttonMul , button10 , buttonC , buttonEqual ;
    TextView edt1 ,edt2,edt3;
    float sum,div,mul,sub ,a,b;
    boolean mAddition , mSubtract ,mMultiplication ,mDivision ;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        buttonAdd = (Button) findViewById(R.id.buttonadd);
        buttonSub = (Button) findViewById(R.id.buttonsub);
        buttonMul = (Button) findViewById(R.id.buttonmul);
        buttonDivision = (Button) findViewById(R.id.buttondiv);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonEqual = (Button) findViewById(R.id.buttoneql);
        edt1 = (TextView) findViewById(R.id.edt1);
        edt2 = (TextView) findViewById(R.id.edt2);
        edt3 = (TextView) findViewById(R.id.edt3);

        edt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                button1.setOnClickListener(new View.OnClickListener()
                {

                    @Override
                    public void onClick(View v) {
                        //edt1.setText(edt1.getText()+"1");
                        edt2.setText(edt2.getText()+"1");
                        //edt3.setText(edt1.getText()+"1");
                    }
                });
                button2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        edt2.setText(edt2.getText()+"2");
                    }

                });
                button3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        edt2.setText(edt2.getText()+"3");
                    }
                });
                button4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        edt2.setText(edt2.getText()+"4");
                    }
                });
                button5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        edt2.setText(edt2.getText()+"5");
                    }
                });
                button6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        edt2.setText(edt2.getText()+"6");
                    }
                });
                button7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        edt2.setText(edt2.getText()+"7");
                    }
                });
                button8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        edt1.setText(edt1.getText()+"8");
                    }
                });
                button9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        edt2.setText(edt2.getText()+"9");
                    }
                });
                button0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        edt2.setText(edt2.getText()+"0");
                    }
                });
                buttonC.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        edt2.setText("");
                    }
                });
                button10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        edt2.setText(edt2.getText()+".");
                    }
                });


                edt3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        button1.setOnClickListener(new View.OnClickListener()
                        {

                            @Override
                            public void onClick(View v) {
                                //edt1.setText(edt1.getText()+"1");
                                edt3.setText(edt3.getText()+"1");
                                //edt3.setText(edt1.getText()+"1");
                            }
                        });
                        button2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                edt3.setText(edt3.getText()+"2");
                            }

                        });
                        button3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                edt3.setText(edt3.getText()+"3");
                            }
                        });
                        button4.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                edt3.setText(edt3.getText()+"4");
                            }
                        });
                        button5.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                edt3.setText(edt3.getText()+"5");
                            }
                        });
                        button6.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                edt3.setText(edt3.getText()+"6");
                            }
                        });
                        button7.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                edt3.setText(edt3.getText()+"7");
                            }
                        });
                        button8.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                edt3.setText(edt3.getText()+"8");
                            }
                        });
                        button9.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                edt3.setText(edt3.getText()+"9");
                            }
                        });
                        button0.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                edt3.setText(edt3.getText()+"0");
                            }
                        });
                        buttonC.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                edt3.setText("");
                            }
                        });
                        button10.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                edt3.setText(edt3.getText()+".");
                            }
                        });
                    }
                });

            }
        });


        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                a= Float.parseFloat(edt2.getText().toString());
                b= Float.parseFloat(edt3.getText().toString());
                float sum=a+b;
               // edt1.setText("");

                   // mValueOne = Float.parseFloat(edt1.getText() + "");
                    mAddition = true;
            }
        });
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Float.parseFloat(edt2.getText().toString());
                b = Float.parseFloat(edt3.getText().toString());
                float sub;

               // mValueOne = Float.parseFloat(edt1.getText() + "");
                mSubtract = true ;
            }
        });
        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                a= Float.parseFloat(edt2.getText().toString());
                b= Float.parseFloat(edt3.getText().toString());
                float mul=a*b;

                //mValueOne = Float.parseFloat(edt1.getText() + "");
                mMultiplication = true ;
            }
        });
        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a= Float.parseFloat(edt2.getText().toString());
                b= Float.parseFloat(edt3.getText().toString());
                float div=a/b;
                //mValueOne = Float.parseFloat(edt1.getText()+"");
                mDivision = true ;
            }
        });
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                mValueTwo = Float.parseFloat(edt1.getText() + "");
                if (mAddition == true){
                    edt1.setText(Float.toString(a+b));
                    mAddition=false;
                }
                if (mSubtract == true)
                {
                    if (a > b) {
                        sub = a - b;
                        edt1.setText(Float.toString( sub));

                    } else{
                        sub = b - a;

                        edt1.setText("-"+Float.toString(sub));

                    }
                    mSubtract=false;
                }
                if (mMultiplication == true)
                {
                    edt1.setText(Float.toString(a*b));
                    mMultiplication=false;
                }
                if (mDivision == true)
                {
                    edt1.setText(Float.toString(a/b));
                    mDivision=false;
                }
            }
        });

    }
}
