import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',
      theme: ThemeData(
        // This is the theme of your application.
        //
        // Try running your application with "flutter run". You'll see the
        // application has a blue toolbar. Then, without quitting the app, try
        // changing the primarySwatch below to Colors.green and then invoke
        // "hot reload" (press "r" in the console where you ran "flutter run",
        // or simply save your changes to "hot reload" in a Flutter IDE).
        // Notice that the counter didn't reset back to zero; the application
        // is not restarted.
        primarySwatch: Colors.grey,
      ),
      home: HomePage(),
    );
  }
}
class HomePage extends StatefulWidget {
  const HomePage({Key? key}) : super(key: key);

  @override
  _HomePageState createState() => _HomePageState();
}

class _HomePageState extends State<HomePage> {

  @override
  Widget build(BuildContext context){
    return Scaffold(body: SignupScreen()
    );
  }
}



class SignupScreen extends StatefulWidget {
  const SignupScreen({Key? key}) : super(key: key);

  @override
  _SignupScreenState createState() => _SignupScreenState();
}

class _SignupScreenState extends State<SignupScreen> {
  @override
  Widget build(BuildContext context) {

    return Padding(
        padding: EdgeInsets.all(16.0),
        child:SingleChildScrollView(child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            const Text("APCNF",
              style: TextStyle(
                color: Color.fromARGB(255, 3, 112, 60),
                fontSize: 28.0,
                fontWeight: FontWeight.bold,),
            ),

            const Text("Register",
              style:TextStyle(color: Color.fromARGB(255, 3, 112, 60),
                fontSize: 20.0,
                fontWeight:FontWeight.bold,
              ),
            ),

            const SizedBox(
                height: 18.0
            ),

            const TextField(
              keyboardType: TextInputType.number,
              decoration: const InputDecoration(
                hintText: "Aadhar Number",
              ),
            ),

            const SizedBox(
              height: 18.0,
            ),

            const TextField(
              keyboardType: TextInputType.name,
              decoration: const InputDecoration(
                hintText: "First Name",
              ),
            ),

            const SizedBox(
              height: 18.0,
            ),

            const TextField(
              keyboardType: TextInputType.name,
              decoration: const InputDecoration(
                hintText: "Last Name",
              ),
            ),

            const SizedBox(
              height: 18.0,
            ),



            const TextField(
              keyboardType: TextInputType.name,
              decoration: const InputDecoration(
                hintText: "Village",
              ),
            ),

            const SizedBox(
              height: 18.0,
            ),

            const TextField(
              keyboardType: TextInputType.name,
              decoration: const InputDecoration(
                hintText: "Mandal",
              ),
            ),


            const SizedBox(
              height: 18.0,
            ),

            const TextField(
              keyboardType: TextInputType.name,
              decoration: const InputDecoration(
                hintText: "District",
              ),
            ),

            const SizedBox(
              height: 18.0,
            ),

            const TextField(
              obscureText: true,
              keyboardType: TextInputType.visiblePassword,
              decoration: InputDecoration(
                hintText: "create a password",
              ),
            ),

            const SizedBox(
              height: 18.0,
            ),

            const TextField(
              obscureText: true,
              keyboardType: TextInputType.visiblePassword,
              decoration: InputDecoration(
                hintText: "Re-enter password ",
              ),
            ),




            const SizedBox(
              height: 10.0,
            ),

            Container(
              width: double.infinity,
              child: RawMaterialButton(
                fillColor: Color(0xFF03610B),
                elevation: 0.0,
                padding: EdgeInsets.symmetric(vertical: 03.0),
                shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(12.0)),

                onPressed: () {},
                child: Text("SIGN UP",
                  style: TextStyle(
                    color:Colors.white,
                    fontSize: 18.0,


                  ),),
              ),
            ),

          ],
        ),)
    );
  }
}


