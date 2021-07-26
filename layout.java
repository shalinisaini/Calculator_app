<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools" android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:paddingLeft="5dp"
    android:paddingRight="5dp"
    android:paddingTop="5dp"
    android:paddingBottom="5dp"
    tools:context=".MainActivity"
    android:id="@+id/relative1">


    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:id="@+id/edt1"
        android:layout_alignParentTop="true"
        android:layout_alignParentLeft="true"
        android:layout_alignParentStart="true" />

    <TextView
        android:id="@+id/edt2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentLeft="true"
        android:layout_alignParentStart="true"
        android:hint="ip one"
        android:layout_below="@+id/edt1"/>

    <TextView
        android:id="@+id/edt3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:hint="ip two"
        android:layout_alignParentRight="true"
        android:layout_alignParentEnd="true"
        android:layout_below="@+id/edt1"/>

    <Button
        style="?android:attr/buttonStyleSmall"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="1"
        android:id="@+id/button1"
        android:layout_marginTop="94dp"
        android:layout_below="@+id/edt1"
        android:layout_alignRight="@+id/button4"
        android:layout_toLeftOf="@id/button4"
        android:layout_alignEnd="@+id/button4"
        android:layout_toStartOf="@+id/button4" />

    <Button
        style="?android:attr/buttonStyleSmall"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="2"
        android:id="@+id/button2"
        android:layout_alignTop="@+id/button1"
        android:layout_toLeftOf="@+id/button3"
        android:layout_toStartOf="@+id/button3" />


    <Button
        style="?android:attr/buttonStyleSmall"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="3"
        android:id="@+id/button3"
        android:layout_alignTop="@+id/button2"
        android:layout_centerHorizontal="true" />


    <Button
        style="?android:attr/buttonStyleSmall"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="4"
        android:id="@+id/button4"
        android:layout_below="@+id/button1"
        android:layout_toLeftOf="@+id/button2" />


    <Button
        style="?android:attr/buttonStyleSmall"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="5"
        android:id="@+id/button5"
        android:layout_alignBottom="@+id/button4"
        android:layout_alignLeft="@+id/button2"
        android:layout_alignStart="@+id/button2" />


    <Button
        style="?android:attr/buttonStyleSmall"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="6"
        android:id="@+id/button6"
        android:layout_below="@+id/button3"
        android:layout_alignLeft="@+id/button3"
        android:layout_alignStart="@+id/button3" />


    <Button
        style="?android:attr/buttonStyleSmall"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="7"
        android:id="@+id/button7"
        android:layout_below="@+id/button4"
        android:layout_toLeftOf="@+id/button2" />


    <Button
        style="?android:attr/buttonStyleSmall"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="8"
        android:id="@+id/button8"
        android:layout_below="@+id/button5"
        android:layout_alignLeft="@+id/button5"
        android:layout_alignStart="@+id/button5" />


    <Button
        style="?android:attr/buttonStyleSmall"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="9"
        android:id="@+id/button9"
        android:layout_below="@+id/button6"
        android:layout_alignLeft="@+id/button6"
        android:layout_alignStart="@+id/button6" />


    <Button
        style="?android:attr/buttonStyleSmall"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="+"
        android:id="@+id/buttonadd"
        android:layout_alignBaseline="@+id/button3"
        android:layout_alignBottom="@+id/button3"
        android:layout_toLeftOf="@+id/buttonsub"
        android:layout_toStartOf="@+id/buttonsub" />

    <Button
        style="?android:attr/buttonStyleSmall"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="-"
        android:id="@+id/buttonsub"
        android:layout_alignBaseline="@+id/buttonmul"
        android:layout_alignBottom="@+id/buttonmul"
        android:layout_alignParentRight="true"
        android:layout_alignParentEnd="true" />


    <Button
        style="?android:attr/buttonStyleSmall"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="*"
        android:id="@+id/buttonmul"
        android:layout_above="@+id/buttonC"
        android:layout_toRightOf="@+id/button6"
        android:layout_toEndOf="@+id/button6"
        android:layout_marginLeft="21dp"
        android:layout_marginStart="21dp"
        android:layout_marginBottom="21dp" />


    <Button
        style="?android:attr/buttonStyleSmall"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="."
        android:id="@+id/button10"
        android:layout_below="@+id/button7"
        android:layout_toLeftOf="@+id/button2" />


    <Button
        style="?android:attr/buttonStyleSmall"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="0"
        android:id="@+id/button0"
        android:layout_below="@+id/button8"
        android:layout_alignLeft="@+id/button9"
        android:layout_alignStart="@+id/button8" />


    <Button
        style="?android:attr/buttonStyleSmall"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="C"
        android:id="@+id/buttonC"
        android:layout_below="@+id/button9"
        android:layout_alignLeft="@+id/button9"
        android:layout_alignStart="@+id/button9" />


    <Button
        style="?android:attr/buttonStyleSmall"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="/"
        android:id="@+id/buttondiv"
        android:layout_alignBaseline="@+id/buttonC"
        android:layout_alignBottom="@+id/buttonadd"
        android:layout_toLeftOf="@+id/buttonsub"
        android:layout_toRightOf="@+id/buttonmul"
        android:layout_toStartOf="@+id/buttonsub" />


    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="="
        android:id="@+id/buttoneql"
        android:layout_marginTop="27dp"
        android:layout_below="@+id/button0"
        android:layout_alignRight="@+id/button10"
        android:layout_alignEnd="@+id/buttonC"
        android:layout_marginRight="26dp"
        android:layout_marginEnd="26dp" />




</RelativeLayout>

