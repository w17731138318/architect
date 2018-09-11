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
## jinfo
### 查看jvm的参数
jinfo -flags process_id (进程ID)
### 查看java系统参数
jinfo -sysprops process_id
### PrintGC默认是打开的，只需要打开PrintGCDetails参数
jinfo -flag +PrintGC pid
jinfo -flag +PrintGCDetails pid
### 要关闭GC日志的打印，使用下面的命令
jinfo -flag -PrintGC pid
jinfo -flag -PrintGCDetails pid
### 查看是否开启了GC日志的打印
jinfo -flag PrintGC pid
jinfo -flag PrintGCDetails pid
## 用 jmap 命令 导出内存信息文件
jmap [option] pid
jmap不仅能生成dump文件，还可以查询finalize执行队列、Java堆和永久代的详细信息，如当前使用率、当前使用的是哪种收集器等。【内存分析】
jmap -dump:format=b,file=heap.hprof pid

### options参数
heap : 显示Java堆详细信息

histo : 显示堆中对象的统计信息 

permstat :Java堆内存的永久保存区域的类加载器的统计信息 

finalizerinfo : 显示在F-Queue队列等待Finalizer线程执行finalizer方法的对象 

dump : 生成堆转储快照 

F : 当-dump没有响应时，强制生成dump快照 

## 用MAT工具分析导出的文件

![1](https://github.com/w17731138318/architect/blob/master/jvm-demo/src/main/java/com/jvm/jvmdemo/web/img/1.png)
![2](https://github.com/w17731138318/architect/blob/master/jvm-demo/src/main/java/com/jvm/jvmdemo/web/img/2.png)
![3](https://github.com/w17731138318/architect/blob/master/jvm-demo/src/main/java/com/jvm/jvmdemo/web/img/3.png)
## CPU利用率高怎么解决 查看线程 和 死锁
jstack [ option ] pid
基本参数：

-F当’jstack [-l] pid’没有相应的时候强制打印栈信息,如果直接jstack无响应时，用于强制jstack），一般情况不需要使用

-l长列表. 打印关于锁的附加信息,例如属于java.util.concurrent的ownable synchronizers列表，会使得JVM停顿得长久得多（可能会差很多倍，比如普通的jstack可能几毫秒和一次GC没区别，加了-l 就是近一秒的时间），-l 建议不要用。一般情况不需要使用

-m打印java和native c/c++框架的所有栈信息.可以打印JVM的堆栈,显示上Native的栈帧，一般应用排查不需要使用

-h | -help打印帮助信息

pid 需要被打印配置信息的java进程id,可以用jps查询.

jstack -ml 线程 > 线程.txt

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
