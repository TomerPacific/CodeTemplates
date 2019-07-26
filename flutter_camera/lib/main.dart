import 'package:flutter/material.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Camera Template',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: MyHomePage(title: 'Flutter Camera Template'),
    );
  }
}

class MyHomePage extends StatefulWidget {
  MyHomePage({Key key, this.title}) : super(key: key);

  final String title;

  @override
  _MyHomePageState createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {

  @override
  Widget build(BuildContext context) {

    return Scaffold(
      appBar: AppBar(
        title: Text(widget.title),
      ),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: <Widget>[
            MaterialButton(
              child: Text('Open Camera',
                style: new TextStyle(
                  fontSize: 20.0,
                  color: Colors.white,
                ),),
              padding: EdgeInsets.all(20.0),
                color: Colors.lightBlue,
              splashColor: Colors.white,
                textTheme: ButtonTextTheme.primary,
                shape: SuperellipseShape(
                    borderRadius: BorderRadius.circular(10)
                ),
              onPressed: () {

              }
            ),
          ],
        ),
      ),
    );
  }
}
