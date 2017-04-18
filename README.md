# ChocoLabs Test v1

## Getting start
- Here is the sample workflow of this Android project: "MainActivity.java" get test data from "TestManager.java" and "DataSource.java" provides data to "TestManager.java". You can consider the "TestManager.java" is an interface between "MainActivity.java" and "DataSource.java".

### What you need to do is refactoring
- Try to optimize "TestManager.java" whatever you want.

### What you need to fix
- You will encounter a problem that already existed on "getData" function in "MainActivity.java" and it causes the result of "Get data fail". We need you to fix that problem and get result of "Get data success".

### What method you need to implement
- Use "Retrofit" and "GSON" library to parse data from "http://www.mocky.io/v2/58b69fc6110000d4109c41f4". 

### What feature you need to implement
- You need to create a "recyclerView adapter" to display UI as following picture.
![Image of Yaktocat](http://i.imgur.com/YVXFTD7.png)
- All the data are comes from the method that we need you to implement above.
- You don't need to handle click event in "recyclerView adapter".
- Color style is already existed on "res" folder.

### IDE
- Android Studio


### Note

| attr        |   mean      |
|----------   |------:      |
| pink_title  | title color |
| text_color  |  text color |



