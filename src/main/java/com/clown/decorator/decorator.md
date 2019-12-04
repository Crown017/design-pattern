# 装饰模式

```
InputStream bis = new BufferedInputStream(new FileInputStream(new File("/home/user/abc.txt")));
```
上面的BufferedInputStream就是具体的装饰组件,FileInputStream 就是一个被装饰的组件。