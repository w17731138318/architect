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

![Alt text](https://github.com/w17731138318/architect/blob/master/jvm-demo/src/main/java/com/jvm/jvmdemo/web/img/1.png)