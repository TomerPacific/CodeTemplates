import 'package:flutter/material.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Sortable List',
      theme: ThemeData(

        primarySwatch: Colors.blue,
      ),
      home: MyHomePage(title: 'Sortable List Template'),
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

  List<String> _data = ["A", "B", "C"];

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text(widget.title),
      ),
      body: ReorderableListView(children: _data.map((list_item) =>
        ListTile(
          key:  Key(list_item),
          title: Text(list_item),
          trailing: Icon(Icons.arrow_forward),
        )
      ).toList(),
          onReorder: (oldIndex, newIndex) {
            setState(() {
              if (newIndex > _data.length) newIndex = _data.length;
              if (oldIndex < newIndex) newIndex--;

              String item = _data[oldIndex];
              _data.remove(item);
              _data.insert(newIndex, item);
            });
          }),
    );
  }
}
