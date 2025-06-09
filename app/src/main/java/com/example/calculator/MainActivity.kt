package com.example.calculator

import android.R.attr.text
import android.graphics.Color
import android.graphics.Color.BLACK
import android.graphics.Color.DKGRAY
import android.graphics.Color.parseColor
//import android.inputmethodservice.Keyboard
import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.DarkGray
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import com.example.calculator.ui.theme.CALCULATORTheme
import androidx.compose.runtime.setValue
import androidx.compose.ui.unit.sp
import androidx.compose.ui.Alignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        enableEdgeToEdge()
        setContent {
            window.decorView.setBackgroundColor(parseColor("#FF03DAC5"))
            CALCULATORTheme {
                Surface(modifier = Modifier
                    .fillMaxSize()
                    .background(color = androidx.compose.ui.graphics.Color.Gray)){
                    calculator()



                }
            }
        }
    }
}



@Composable
fun calculator() {
    Column (modifier = Modifier
        .fillMaxSize()
        .background(color = androidx.compose.ui.graphics.Color.DarkGray)){  }
    var text by remember { mutableStateOf("") }
    var isvar1 by remember { mutableStateOf(true) }
    var var1 by remember { mutableStateOf(0) }
    var var2 by remember { mutableStateOf(0) }
    var oper by remember { mutableStateOf("") }
    var ans by remember { mutableStateOf("") }


////    var1 = (var1.toString() + "1").toInt()
////    var2 = (var2.toString() + "5").toInt()
////    ans = (var1 + var2).toString()
////    Text("${ans}", fontSize = 90.sp)
    val num1 = var1
    val num2 = var2
    Column(modifier  = Modifier
        .fillMaxSize()
        .padding(vertical = 300.dp)
        .height(180.dp)
        .background(color = androidx.compose.ui.graphics.Color.DarkGray),
        horizontalAlignment = Alignment.End)
    {
        Row (modifier = Modifier.wrapContentSize()){ Text(text,
            fontSize = 25.sp,
            color = androidx.compose.ui.graphics.Color.White) }

        Row (modifier = Modifier.wrapContentSize()){ Text(ans,
             fontSize = 70.sp,
             color = androidx.compose.ui.graphics.Color.White)
        }


    }
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(top = 550.dp, bottom = 45.dp)
        .padding(horizontal = 0.dp)
        .background(color = androidx.compose.ui.graphics.Color.DarkGray),
         verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,

        )
    {
        Row {

            Button(
                onClick = {
                    text = text + "7"
                    if (isvar1) {
                        var1 = (var1.toString() + "7").toInt()

                    } else {
                        var2 = (var2.toString() + "7").toInt()


            }
                             },
                modifier = Modifier
                    .padding(5.dp)
                    .height(50.dp)
                    .width(95.dp)
                    .background(color = DarkGray)
            ){
                Text("7", fontSize = 30.sp)
            }
            Button(onClick = { text = text + "8"
                if(isvar1){
                var1 =(var1.toString() + "8").toInt()
            }else{
                var2 = (var2.toString()+"8").toInt()

            }},modifier = Modifier
                .padding(5.dp)
                .height(50.dp)
                .width(95.dp)
                .background(color = DarkGray)
            ){
                Text("8",fontSize = 30.sp)
            }
            Button(onClick = {  text = text + "9"
                if(isvar1){
                var1 = (var1.toString() + "9").toInt()

            }else{
                var2 = (var2.toString() + "9").toInt()

            }},modifier = Modifier
                .padding(5.dp)
                .height(50.dp)
                .width(95.dp)
                .background(color = DarkGray)){
                Text("9",fontSize = 30.sp)
            }
            Button(onClick = {text += " / "
                oper = "/"
                isvar1 = false },
                modifier = Modifier
                .padding(5.dp)
                .height(50.dp)
                .width(95.dp)
                .background(color = DarkGray)){
                Text("/",fontSize = 22.sp)
            }

        }
        Row {


            Button(onClick = { text = text + "4"
                if(isvar1){
                var1 = (var1.toString() + "4").toInt()

            }else{
                var2 = (var2.toString() + "4").toInt()

            }},modifier = Modifier
                .padding(5.dp)
                .height(50.dp)
                .width(95.dp)
                .background(color = DarkGray)){
                Text("4",fontSize = 30.sp)
            }
            Button(onClick = {text = text + "5"
                if(isvar1){
                var1 = (var1.toString() + "5").toInt()

            }else{
                var2 = (var2.toString() + "5").toInt()
            }},modifier = Modifier
                .padding(5.dp)
                .height(50.dp)
                .width(95.dp)
                .background(color = DarkGray)){
                Text("5",fontSize = 30.sp)
            }
            Button(onClick = { text = text + "6"
                if(isvar1){
                var1 = (var1.toString() + "6").toInt()

            }else{
                var2 = (var2.toString()+"6").toInt()

            }},modifier = Modifier
                .padding(5.dp)
                .height(50.dp)
                .width(95.dp)
                .background(color = DarkGray)){
                Text("6",fontSize = 30.sp)
            }
            Button(onClick = {text += " * "
                oper = "*"
                isvar1 = false             },
                modifier = Modifier
                .padding(5.dp)
                .height(50.dp)
                .width(95.dp)
                .background(color = DarkGray)){
                Text("*",fontSize = 22.sp)
            }

        }
        Row {


            Button(onClick = { text = text + "1"
                if(isvar1){
                var1 = (var1.toString() + "1").toInt()
            }else{
                var2 = (var2.toString()+"1").toInt()

            }},modifier = Modifier
                .padding(5.dp)
                .height(50.dp)
                .width(95.dp)
                .background(color = DarkGray)){
                Text("1",fontSize = 30.sp)
            }
            Button(onClick = { text = text + "2"
                if(isvar1){
                var1 = (var1.toString() + "2").toInt()

            }else{
                var2 = (var2.toString()+"2").toInt()

            }},modifier = Modifier
                .padding(5.dp)
                .height(50.dp)
                .width(95.dp)
                .background(color = DarkGray)){
                Text("2",fontSize = 30.sp)
            }
            Button(onClick = {text = text + "3"
                if(isvar1){
                var1 = (var1.toString() + "3").toInt()

            }else{
                var2 = (var2.toString()+"3").toInt()

            }},modifier = Modifier
                .padding(5.dp)
                .height(50.dp)
                .width(95.dp)
                .background(color = DarkGray)){
                Text("3",fontSize = 30.sp)
            }
            Button(onClick = {text += " + "
                oper = "+"
                isvar1 = false             },
                modifier = Modifier
                .padding(5.dp)
                .height(50.dp)
                .width(95.dp)
                .background(color = DarkGray)){
                Text("+",fontSize = 22.sp)
            }
        }
        Row {


            Button(onClick = {text = text + "0"
                if(isvar1){
                var1 = (var1.toString() + "0").toInt()

            }else{
                var2 = (var2.toString()+"0").toInt()

            }},modifier = Modifier
                .padding(5.dp)
                .height(50.dp)
                .width(95.dp)
                .background(color = DarkGray)){
                Text("0",fontSize = 30.sp)
            }

            Button(onClick = {ans = 0.toString()
                var1 = 0
                var2 = 0
                isvar1= true

                text = ""
            },modifier = Modifier
                .padding(5.dp)
                .height(50.dp)
                .width(95.dp)
                .background(color = DarkGray)){
                Text("C",fontSize = 30.sp)
            }

            Button(onClick = {
               ans = when(oper){
                   "+" -> (num1 + num2).toString()
                   "-" ->(num1 - num2).toString()
                   "*" -> (num1 * num2).toString()
                   "/" -> (num1 / num2).toString()

                   else -> 0.toString()
               }

                var1 = ans.toInt()
                var2 = 0
                text += " = " + "${ans.toInt()}"
                oper = ""},
                modifier = Modifier
                .padding(5.dp)
                .height(50.dp)
                .width(95.dp)
                .background(color = DarkGray)){
                Text("=",fontSize = 30.sp)
            }

            Button(onClick = {text += " - "
                oper = "-"},modifier = Modifier
                .padding(5.dp)
                .height(50.dp)
                .width(95.dp)
                .background(color = DarkGray)
            ){
                Text("-",fontSize = 22.sp)
            }
        }

    }
}




@Preview(showBackground = true)
@Composable
fun calculatorpreview(){
    calculator()
}



