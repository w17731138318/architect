# JVm参数 及内存分析
## 设置堆内存大小
-Xmx32m -Xms32m
## 设置MetaspaceSize
-XX:MetaspaceSize=32m
-XX:MaxMetaspaceSize=32m
## 设置内存溢出后自动导出 及 导出文件位置
-XX:+HeapDumpOnOutOfMemoryError  -XX:HeapDumpPath=./
## 常用命令
jps -l 查看java 进程
## 用 jmap 命令导出内存信息文件
jmap -dump:format=b,file=heap.hprof 22860
## 用MAT工具分析导出的文件

![1](https://github.com/w17731138318/architect/blob/master/jvm-demo/src/main/java/com/jvm/jvmdemo/web/img/1.png)
![2](https://github.com/w17731138318/architect/blob/master/jvm-demo/src/main/java/com/jvm/jvmdemo/web/img/2.png)
![3](https://github.com/w17731138318/architect/blob/master/jvm-demo/src/main/java/com/jvm/jvmdemo/web/img/3.png)
## CPU利用率高怎么解决 查看线程 和 死锁
jstack 线程 > 线程.txt
## Java VisualVM
在tomcat 下 catalina.sh 文件中添加以下配置

JAVA_OPTS="$JAVA_OPTS -Dcom.sun.management.jmxremote.port=1099 
                        -Dcom.sun.management.jmxremote.ssl=false 
                        -Dcom.sun.management.jmxremote.authenticate=false 
                        -Djava.rmi.server.hostname=192.168.1.54"

### Java VisualVM 插件 btrace 
#### 拦截方法 
#### 构造函数
#### 重写的方法 重载的方法
#### 拦截的时机 入口 返回 报错时
#### 拦截this 参数 返回值
#### 其他
