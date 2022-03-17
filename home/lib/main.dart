import 'package:flutter/material.dart';

void main(){
  runApp(MyApp());
}

class MyApp extends StatelessWidget{
  @override
  Widget build(BuildContext context) {
    return MaterialApp( //use MaterialApp() widget like this
        home: Home() //create new widget class for this 'home' to
      // escape 'No MediaQuery widget found' error
    );
  }
}

class Home extends StatelessWidget {


  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("Home"),
        centerTitle: true,
        backgroundColor: Colors.red[600],
      ),

      body:Row(

          mainAxisAlignment: MainAxisAlignment.spaceEvenly,
          children: <Widget>[

          Column(
              children: <Widget>[
              Container(
                child: ElevatedButton.icon(

                  onPressed: () {},
                  icon: Icon( // <-- Icon
                    Icons.cloud_circle,
                    size: 24.0,
                  ),
                  label: Text('weather'), // <-- Text
                ),
              ),

                Container(
                  child: ElevatedButton.icon(

                    onPressed: () {},
                    icon: Icon( // <-- Icon
                      Icons.price_change,
                      size: 24.0,
                    ),
                    label: Text('Market prices'), // <-- Text
                  ),
                ),

                Container(
                  child: ElevatedButton.icon(

                    onPressed: () {},
                    icon: Icon( // <-- Icon
                      Icons.add_shopping_cart,
                      size: 24.0,
                    ),
                    label: Text('Sell crop'), // <-- Text
                  ),
                ),
        ],
      ),


      Column(
         children: <Widget>[



          Container(
          child: ElevatedButton.icon(

          onPressed: () {},
          icon: Icon( // <-- Icon
          Icons.grass,
          size: 24.0,
          ),
          label: Text('Crop care'), // <-- Text
          ),
          ),

           Container(
             child: ElevatedButton.icon(

               onPressed: () {},
               icon: Icon( // <-- Icon
                 Icons.people,
                 size: 24.0,
               ),
               label: Text('Discussion forum'), // <-- Text
             ),
           ),

           Container(
             child: ElevatedButton.icon(

               onPressed: () {},
               icon: Icon( // <-- Icon
                 Icons.account_balance,
                 size: 24.0,
               ),
               label: Text('Govt schemes'), // <-- Text
             ),
           ),

         ],
        ),


          ],
      ),
    );

  }
}
