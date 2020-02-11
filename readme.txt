"D:\Program Files\Java8\jdk\bin\java.exe" -ea -Didea.test.cyclic.buffer.size=1048576 "-javaagent:D:\Program Files\JetBrains\IntelliJ IDEA 2019.1.3\lib\idea_rt.jar=56484:D:\Program Files\JetBrains\IntelliJ IDEA 2019.1.3\bin" -Dfile.encoding=UTF-8 -classpath "D:\Program Files\JetBrains\IntelliJ IDEA 2019.1.3\lib\idea_rt.jar;D:\Program Files\JetBrains\IntelliJ IDEA 2019.1.3\plugins\junit\lib\junit-rt.jar;D:\Program Files\JetBrains\IntelliJ IDEA 2019.1.3\plugins\junit\lib\junit5-rt.jar;D:\Program Files\Java8\jdk\jre\lib\charsets.jar;D:\Program Files\Java8\jdk\jre\lib\deploy.jar;D:\Program Files\Java8\jdk\jre\lib\ext\access-bridge-64.jar;D:\Program Files\Java8\jdk\jre\lib\ext\cldrdata.jar;D:\Program Files\Java8\jdk\jre\lib\ext\dnsns.jar;D:\Program Files\Java8\jdk\jre\lib\ext\jaccess.jar;D:\Program Files\Java8\jdk\jre\lib\ext\jfxrt.jar;D:\Program Files\Java8\jdk\jre\lib\ext\localedata.jar;D:\Program Files\Java8\jdk\jre\lib\ext\nashorn.jar;D:\Program Files\Java8\jdk\jre\lib\ext\sunec.jar;D:\Program Files\Java8\jdk\jre\lib\ext\sunjce_provider.jar;D:\Program Files\Java8\jdk\jre\lib\ext\sunmscapi.jar;D:\Program Files\Java8\jdk\jre\lib\ext\sunpkcs11.jar;D:\Program Files\Java8\jdk\jre\lib\ext\zipfs.jar;D:\Program Files\Java8\jdk\jre\lib\javaws.jar;D:\Program Files\Java8\jdk\jre\lib\jce.jar;D:\Program Files\Java8\jdk\jre\lib\jfr.jar;D:\Program Files\Java8\jdk\jre\lib\jfxswt.jar;D:\Program Files\Java8\jdk\jre\lib\jsse.jar;D:\Program Files\Java8\jdk\jre\lib\management-agent.jar;D:\Program Files\Java8\jdk\jre\lib\plugin.jar;D:\Program Files\Java8\jdk\jre\lib\resources.jar;D:\Program Files\Java8\jdk\jre\lib\rt.jar;D:\Workspace\dmp-sport-spider\target\test-classes;D:\Workspace\dmp-sport-spider\target\classes;D:\Program Files\apache-maven-3.6.1\repo\junit\junit\4.11\junit-4.11.jar;D:\Program Files\apache-maven-3.6.1\repo\org\hamcrest\hamcrest-core\1.3\hamcrest-core-1.3.jar;D:\Program Files\apache-maven-3.6.1\repo\org\mongodb\mongo-java-driver\3.8.0\mongo-java-driver-3.8.0.jar;D:\Program Files\apache-maven-3.6.1\repo\us\codecraft\webmagic-core\0.7.3\webmagic-core-0.7.3.jar;D:\Program Files\apache-maven-3.6.1\repo\org\apache\httpcomponents\httpclient\4.5.2\httpclient-4.5.2.jar;D:\Program Files\apache-maven-3.6.1\repo\org\apache\httpcomponents\httpcore\4.4.4\httpcore-4.4.4.jar;D:\Program Files\apache-maven-3.6.1\repo\commons-logging\commons-logging\1.2\commons-logging-1.2.jar;D:\Program Files\apache-maven-3.6.1\repo\commons-codec\commons-codec\1.9\commons-codec-1.9.jar;D:\Program Files\apache-maven-3.6.1\repo\org\apache\commons\commons-lang3\3.1\commons-lang3-3.1.jar;D:\Program Files\apache-maven-3.6.1\repo\us\codecraft\xsoup\0.3.1\xsoup-0.3.1.jar;D:\Program Files\apache-maven-3.6.1\repo\org\assertj\assertj-core\1.5.0\assertj-core-1.5.0.jar;D:\Program Files\apache-maven-3.6.1\repo\org\slf4j\slf4j-api\1.7.6\slf4j-api-1.7.6.jar;D:\Program Files\apache-maven-3.6.1\repo\org\slf4j\slf4j-log4j12\1.7.6\slf4j-log4j12-1.7.6.jar;D:\Program Files\apache-maven-3.6.1\repo\log4j\log4j\1.2.17\log4j-1.2.17.jar;D:\Program Files\apache-maven-3.6.1\repo\commons-collections\commons-collections\3.2.2\commons-collections-3.2.2.jar;D:\Program Files\apache-maven-3.6.1\repo\org\jsoup\jsoup\1.10.3\jsoup-1.10.3.jar;D:\Program Files\apache-maven-3.6.1\repo\commons-io\commons-io\1.3.2\commons-io-1.3.2.jar;D:\Program Files\apache-maven-3.6.1\repo\com\jayway\jsonpath\json-path\2.4.0\json-path-2.4.0.jar;D:\Program Files\apache-maven-3.6.1\repo\net\minidev\json-smart\2.3\json-smart-2.3.jar;D:\Program Files\apache-maven-3.6.1\repo\net\minidev\accessors-smart\1.2\accessors-smart-1.2.jar;D:\Program Files\apache-maven-3.6.1\repo\org\ow2\asm\asm\5.0.4\asm-5.0.4.jar;D:\Program Files\apache-maven-3.6.1\repo\com\alibaba\fastjson\1.2.28\fastjson-1.2.28.jar;D:\Program Files\apache-maven-3.6.1\repo\com\typesafe\config\1.3.1\config-1.3.1.jar;D:\Program Files\apache-maven-3.6.1\repo\com\google\code\gson\gson\2.8.4\gson-2.8.4.jar" com.intellij.rt.execution.junit.JUnitStarter -ideVersion5 -junit4 com.sndo.dmp.ValidProxyProviderTest,test

2019-10-08 19:13:28,895 INFO  [main] logging.SLF4JLogger(71): Cluster created with settings {hosts=[192.168.110.129:27017], mode=SINGLE, requiredClusterType=UNKNOWN, serverSelectionTimeout='30000 ms', maxWaitQueueSize=500}
2019-10-08 19:13:28,990 INFO  [cluster-ClusterId{value='5d9c6f580023be3390a37540', description='null'}-192.168.110.129:27017] logging.SLF4JLogger(71): Opened connection [connectionId{localValue:1, serverValue:13}] to 192.168.110.129:27017
2019-10-08 19:13:28,992 INFO  [main] logging.SLF4JLogger(71): Cluster description not yet available. Waiting for 30000 ms before timing out
2019-10-08 19:13:28,993 INFO  [cluster-ClusterId{value='5d9c6f580023be3390a37540', description='null'}-192.168.110.129:27017] logging.SLF4JLogger(71): Monitor thread successfully connected to server with description ServerDescription{address=192.168.110.129:27017, type=STANDALONE, state=CONNECTED, ok=true, version=ServerVersion{versionList=[3, 4, 21]}, minWireVersion=0, maxWireVersion=5, maxDocumentSize=16777216, logicalSessionTimeoutMinutes=null, roundTripTimeNanos=1461100}
2019-10-08 19:13:29,005 INFO  [main] logging.SLF4JLogger(71): Opened connection [connectionId{localValue:2, serverValue:14}] to 192.168.110.129:27017
java.net.SocketTimeoutException: Read timed out
	at java.net.SocketInputStream.socketRead0(Native Method)
	at java.net.SocketInputStream.socketRead(SocketInputStream.java:116)
	at java.net.SocketInputStream.read(SocketInputStream.java:170)
	at java.net.SocketInputStream.read(SocketInputStream.java:141)
	at sun.security.ssl.InputRecord.readFully(InputRecord.java:465)
	at sun.security.ssl.InputRecord.read(InputRecord.java:503)
	at sun.security.ssl.SSLSocketImpl.readRecord(SSLSocketImpl.java:973)
	at sun.security.ssl.SSLSocketImpl.performInitialHandshake(SSLSocketImpl.java:1375)
	at sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:1403)
	at sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:1387)
	at org.apache.http.conn.ssl.SSLConnectionSocketFactory.createLayeredSocket(SSLConnectionSocketFactory.java:394)
	at org.apache.http.impl.conn.DefaultHttpClientConnectionOperator.upgrade(DefaultHttpClientConnectionOperator.java:192)
	at org.apache.http.impl.conn.PoolingHttpClientConnectionManager.upgrade(PoolingHttpClientConnectionManager.java:369)
	at org.apache.http.impl.execchain.MainClientExec.establishRoute(MainClientExec.java:415)
	at org.apache.http.impl.execchain.MainClientExec.execute(MainClientExec.java:236)
	at org.apache.http.impl.execchain.ProtocolExec.execute(ProtocolExec.java:184)
	at org.apache.http.impl.execchain.RetryExec.execute(RetryExec.java:88)
	at org.apache.http.impl.execchain.RedirectExec.execute(RedirectExec.java:110)
	at org.apache.http.impl.client.InternalHttpClient.doExecute(InternalHttpClient.java:184)
	at org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:82)
	at com.sndo.dmp.util.ProxyUtils.isValid(ProxyUtils.java:26)
	at com.sndo.dmp.ValidProxyProviderTest.initProxyProvider(ValidProxyProviderTest.java:67)
	at com.sndo.dmp.ValidProxyProviderTest.test(ValidProxyProviderTest.java:21)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:47)
	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:44)
	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:271)
	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:70)
	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:50)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
	at org.junit.runner.JUnitCore.run(JUnitCore.java:160)
	at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)
	at com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:47)
	at com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242)
	at com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)
org.apache.http.conn.HttpHostConnectException: Connect to 27.42.168.46:41528 [/27.42.168.46] failed: Connection refused: connect
	at org.apache.http.impl.conn.DefaultHttpClientConnectionOperator.connect(DefaultHttpClientConnectionOperator.java:158)
	at org.apache.http.impl.conn.PoolingHttpClientConnectionManager.connect(PoolingHttpClientConnectionManager.java:353)
	at org.apache.http.impl.execchain.MainClientExec.establishRoute(MainClientExec.java:388)
	at org.apache.http.impl.execchain.MainClientExec.execute(MainClientExec.java:236)
	at org.apache.http.impl.execchain.ProtocolExec.execute(ProtocolExec.java:184)
	at org.apache.http.impl.execchain.RetryExec.execute(RetryExec.java:88)
	at org.apache.http.impl.execchain.RedirectExec.execute(RedirectExec.java:110)
	at org.apache.http.impl.client.InternalHttpClient.doExecute(InternalHttpClient.java:184)
	at org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:82)
	at com.sndo.dmp.util.ProxyUtils.isValid(ProxyUtils.java:26)
	at com.sndo.dmp.ValidProxyProviderTest.initProxyProvider(ValidProxyProviderTest.java:67)
	at com.sndo.dmp.ValidProxyProviderTest.test(ValidProxyProviderTest.java:21)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:47)
	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:44)
	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:271)
	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:70)
	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:50)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
	at org.junit.runner.JUnitCore.run(JUnitCore.java:160)
	at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)
	at com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:47)
	at com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242)
	at com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)
Caused by: java.net.ConnectException: Connection refused: connect
	at java.net.DualStackPlainSocketImpl.waitForConnect(Native Method)
	at java.net.DualStackPlainSocketImpl.socketConnect(DualStackPlainSocketImpl.java:85)
	at java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:350)
	at java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:206)
	at java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:188)
	at java.net.PlainSocketImpl.connect(PlainSocketImpl.java:172)
	at java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392)
	at java.net.Socket.connect(Socket.java:589)
	at org.apache.http.conn.socket.PlainConnectionSocketFactory.connectSocket(PlainConnectionSocketFactory.java:74)
	at org.apache.http.impl.conn.DefaultHttpClientConnectionOperator.connect(DefaultHttpClientConnectionOperator.java:141)
	... 33 more
java.net.SocketTimeoutException: Read timed out
	at java.net.SocketInputStream.socketRead0(Native Method)
	at java.net.SocketInputStream.socketRead(SocketInputStream.java:116)
	at java.net.SocketInputStream.read(SocketInputStream.java:170)
	at java.net.SocketInputStream.read(SocketInputStream.java:141)
	at sun.security.ssl.InputRecord.readFully(InputRecord.java:465)
	at sun.security.ssl.InputRecord.read(InputRecord.java:503)
	at sun.security.ssl.SSLSocketImpl.readRecord(SSLSocketImpl.java:973)
	at sun.security.ssl.SSLSocketImpl.performInitialHandshake(SSLSocketImpl.java:1375)
	at sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:1403)
	at sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:1387)
	at org.apache.http.conn.ssl.SSLConnectionSocketFactory.createLayeredSocket(SSLConnectionSocketFactory.java:394)
	at org.apache.http.impl.conn.DefaultHttpClientConnectionOperator.upgrade(DefaultHttpClientConnectionOperator.java:192)
	at org.apache.http.impl.conn.PoolingHttpClientConnectionManager.upgrade(PoolingHttpClientConnectionManager.java:369)
	at org.apache.http.impl.execchain.MainClientExec.establishRoute(MainClientExec.java:415)
	at org.apache.http.impl.execchain.MainClientExec.execute(MainClientExec.java:236)
	at org.apache.http.impl.execchain.ProtocolExec.execute(ProtocolExec.java:184)
	at org.apache.http.impl.execchain.RetryExec.execute(RetryExec.java:88)
	at org.apache.http.impl.execchain.RedirectExec.execute(RedirectExec.java:110)
	at org.apache.http.impl.client.InternalHttpClient.doExecute(InternalHttpClient.java:184)
	at org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:82)
	at com.sndo.dmp.util.ProxyUtils.isValid(ProxyUtils.java:26)
	at com.sndo.dmp.ValidProxyProviderTest.initProxyProvider(ValidProxyProviderTest.java:67)
	at com.sndo.dmp.ValidProxyProviderTest.test(ValidProxyProviderTest.java:21)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:47)
	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:44)
	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:271)
	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:70)
	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:50)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
	at org.junit.runner.JUnitCore.run(JUnitCore.java:160)
	at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)
	at com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:47)
	at com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242)
	at com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)
10
0proxy: Proxy{host='195.171.27.244', port=3128, username='null', password='null'}
1proxy: Proxy{host='116.196.90.176', port=3128, username='null', password='null'}
2proxy: Proxy{host='104.248.155.150', port=8080, username='null', password='null'}
3proxy: Proxy{host='118.26.170.209', port=8080, username='null', password='null'}
4proxy: Proxy{host='195.91.166.149', port=3128, username='null', password='null'}
5proxy: Proxy{host='123.139.56.238', port=9999, username='null', password='null'}
6proxy: Proxy{host='200.89.159.149', port=8000, username='null', password='null'}
7proxy: Proxy{host='124.172.232.49', port=8010, username='null', password='null'}
8proxy: Proxy{host='121.33.220.158', port=808, username='null', password='null'}
0key:Proxy{host='104.248.155.150', port=8080, username='null', password='null'}; value: true
1key:Proxy{host='116.196.90.181', port=3128, username='null', password='null'}; value: false
2key:Proxy{host='116.196.90.176', port=3128, username='null', password='null'}; value: true
3key:Proxy{host='195.171.27.244', port=3128, username='null', password='null'}; value: true
4key:Proxy{host='121.33.220.158', port=808, username='null', password='null'}; value: true
5key:Proxy{host='118.26.170.209', port=8080, username='null', password='null'}; value: true
6key:Proxy{host='195.91.166.149', port=3128, username='null', password='null'}; value: true
7key:Proxy{host='200.89.159.149', port=8000, username='null', password='null'}; value: true
8key:Proxy{host='123.139.56.238', port=9999, username='null', password='null'}; value: true
9key:Proxy{host='124.172.232.49', port=8010, username='null', password='null'}; value: true
======================>0
0proxy: Proxy{host='116.196.90.176', port=3128, username='null', password='null'}
1proxy: Proxy{host='104.248.155.150', port=8080, username='null', password='null'}
2proxy: Proxy{host='118.26.170.209', port=8080, username='null', password='null'}
3proxy: Proxy{host='195.91.166.149', port=3128, username='null', password='null'}
4proxy: Proxy{host='123.139.56.238', port=9999, username='null', password='null'}
5proxy: Proxy{host='200.89.159.149', port=8000, username='null', password='null'}
6proxy: Proxy{host='124.172.232.49', port=8010, username='null', password='null'}
7proxy: Proxy{host='121.33.220.158', port=808, username='null', password='null'}
8proxy: Proxy{host='195.171.27.244', port=3128, username='null', password='null'}
0key:Proxy{host='104.248.155.150', port=8080, username='null', password='null'}; value: true
1key:Proxy{host='116.196.90.176', port=3128, username='null', password='null'}; value: true
2key:Proxy{host='195.171.27.244', port=3128, username='null', password='null'}; value: true
3key:Proxy{host='121.33.220.158', port=808, username='null', password='null'}; value: true
4key:Proxy{host='118.26.170.209', port=8080, username='null', password='null'}; value: true
5key:Proxy{host='195.91.166.149', port=3128, username='null', password='null'}; value: true
6key:Proxy{host='200.89.159.149', port=8000, username='null', password='null'}; value: true
7key:Proxy{host='123.139.56.238', port=9999, username='null', password='null'}; value: true
8key:Proxy{host='124.172.232.49', port=8010, username='null', password='null'}; value: true
======================>1
0proxy: Proxy{host='104.248.155.150', port=8080, username='null', password='null'}
1proxy: Proxy{host='118.26.170.209', port=8080, username='null', password='null'}
2proxy: Proxy{host='195.91.166.149', port=3128, username='null', password='null'}
3proxy: Proxy{host='123.139.56.238', port=9999, username='null', password='null'}
4proxy: Proxy{host='200.89.159.149', port=8000, username='null', password='null'}
5proxy: Proxy{host='124.172.232.49', port=8010, username='null', password='null'}
6proxy: Proxy{host='121.33.220.158', port=808, username='null', password='null'}
7proxy: Proxy{host='195.171.27.244', port=3128, username='null', password='null'}
8proxy: Proxy{host='116.196.90.176', port=3128, username='null', password='null'}
0key:Proxy{host='104.248.155.150', port=8080, username='null', password='null'}; value: true
1key:Proxy{host='116.196.90.176', port=3128, username='null', password='null'}; value: true
2key:Proxy{host='195.171.27.244', port=3128, username='null', password='null'}; value: true
3key:Proxy{host='121.33.220.158', port=808, username='null', password='null'}; value: true
4key:Proxy{host='118.26.170.209', port=8080, username='null', password='null'}; value: true
5key:Proxy{host='195.91.166.149', port=3128, username='null', password='null'}; value: true
6key:Proxy{host='200.89.159.149', port=8000, username='null', password='null'}; value: true
7key:Proxy{host='123.139.56.238', port=9999, username='null', password='null'}; value: true
8key:Proxy{host='124.172.232.49', port=8010, username='null', password='null'}; value: true
======================>2
0proxy: Proxy{host='118.26.170.209', port=8080, username='null', password='null'}
1proxy: Proxy{host='195.91.166.149', port=3128, username='null', password='null'}
2proxy: Proxy{host='123.139.56.238', port=9999, username='null', password='null'}
3proxy: Proxy{host='200.89.159.149', port=8000, username='null', password='null'}
4proxy: Proxy{host='124.172.232.49', port=8010, username='null', password='null'}
5proxy: Proxy{host='121.33.220.158', port=808, username='null', password='null'}
6proxy: Proxy{host='195.171.27.244', port=3128, username='null', password='null'}
7proxy: Proxy{host='116.196.90.176', port=3128, username='null', password='null'}
8proxy: Proxy{host='104.248.155.150', port=8080, username='null', password='null'}
0key:Proxy{host='104.248.155.150', port=8080, username='null', password='null'}; value: true
1key:Proxy{host='116.196.90.176', port=3128, username='null', password='null'}; value: true
2key:Proxy{host='195.171.27.244', port=3128, username='null', password='null'}; value: true
3key:Proxy{host='121.33.220.158', port=808, username='null', password='null'}; value: true
4key:Proxy{host='118.26.170.209', port=8080, username='null', password='null'}; value: true
5key:Proxy{host='195.91.166.149', port=3128, username='null', password='null'}; value: true
6key:Proxy{host='200.89.159.149', port=8000, username='null', password='null'}; value: true
7key:Proxy{host='123.139.56.238', port=9999, username='null', password='null'}; value: true
8key:Proxy{host='124.172.232.49', port=8010, username='null', password='null'}; value: true
======================>3
0proxy: Proxy{host='195.91.166.149', port=3128, username='null', password='null'}
1proxy: Proxy{host='123.139.56.238', port=9999, username='null', password='null'}
2proxy: Proxy{host='200.89.159.149', port=8000, username='null', password='null'}
3proxy: Proxy{host='124.172.232.49', port=8010, username='null', password='null'}
4proxy: Proxy{host='121.33.220.158', port=808, username='null', password='null'}
5proxy: Proxy{host='195.171.27.244', port=3128, username='null', password='null'}
6proxy: Proxy{host='116.196.90.176', port=3128, username='null', password='null'}
7proxy: Proxy{host='104.248.155.150', port=8080, username='null', password='null'}
8proxy: Proxy{host='118.26.170.209', port=8080, username='null', password='null'}
0key:Proxy{host='104.248.155.150', port=8080, username='null', password='null'}; value: true
1key:Proxy{host='116.196.90.176', port=3128, username='null', password='null'}; value: true
2key:Proxy{host='195.171.27.244', port=3128, username='null', password='null'}; value: true
3key:Proxy{host='121.33.220.158', port=808, username='null', password='null'}; value: true
4key:Proxy{host='118.26.170.209', port=8080, username='null', password='null'}; value: true
5key:Proxy{host='195.91.166.149', port=3128, username='null', password='null'}; value: true
6key:Proxy{host='200.89.159.149', port=8000, username='null', password='null'}; value: true
7key:Proxy{host='123.139.56.238', port=9999, username='null', password='null'}; value: true
8key:Proxy{host='124.172.232.49', port=8010, username='null', password='null'}; value: true
======================>4
0proxy: Proxy{host='123.139.56.238', port=9999, username='null', password='null'}
1proxy: Proxy{host='200.89.159.149', port=8000, username='null', password='null'}
2proxy: Proxy{host='124.172.232.49', port=8010, username='null', password='null'}
3proxy: Proxy{host='121.33.220.158', port=808, username='null', password='null'}
4proxy: Proxy{host='195.171.27.244', port=3128, username='null', password='null'}
5proxy: Proxy{host='116.196.90.176', port=3128, username='null', password='null'}
6proxy: Proxy{host='104.248.155.150', port=8080, username='null', password='null'}
7proxy: Proxy{host='118.26.170.209', port=8080, username='null', password='null'}
8proxy: Proxy{host='195.91.166.149', port=3128, username='null', password='null'}
0key:Proxy{host='104.248.155.150', port=8080, username='null', password='null'}; value: true
1key:Proxy{host='116.196.90.176', port=3128, username='null', password='null'}; value: true
2key:Proxy{host='195.171.27.244', port=3128, username='null', password='null'}; value: true
3key:Proxy{host='121.33.220.158', port=808, username='null', password='null'}; value: true
4key:Proxy{host='118.26.170.209', port=8080, username='null', password='null'}; value: true
5key:Proxy{host='195.91.166.149', port=3128, username='null', password='null'}; value: true
6key:Proxy{host='200.89.159.149', port=8000, username='null', password='null'}; value: true
7key:Proxy{host='123.139.56.238', port=9999, username='null', password='null'}; value: true
8key:Proxy{host='124.172.232.49', port=8010, username='null', password='null'}; value: true
======================>5
org.apache.http.conn.ConnectTimeoutException: Connect to 200.89.174.229:8080 [/200.89.174.229] failed: connect timed out
	at org.apache.http.impl.conn.DefaultHttpClientConnectionOperator.connect(DefaultHttpClientConnectionOperator.java:150)
	at org.apache.http.impl.conn.PoolingHttpClientConnectionManager.connect(PoolingHttpClientConnectionManager.java:353)
	at org.apache.http.impl.execchain.MainClientExec.establishRoute(MainClientExec.java:388)
	at org.apache.http.impl.execchain.MainClientExec.execute(MainClientExec.java:236)
	at org.apache.http.impl.execchain.ProtocolExec.execute(ProtocolExec.java:184)
	at org.apache.http.impl.execchain.RetryExec.execute(RetryExec.java:88)
	at org.apache.http.impl.execchain.RedirectExec.execute(RedirectExec.java:110)
	at org.apache.http.impl.client.InternalHttpClient.doExecute(InternalHttpClient.java:184)
	at org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:82)
	at com.sndo.dmp.util.ProxyUtils.isValid(ProxyUtils.java:26)
	at com.sndo.dmp.ValidProxyProvider$ProxyManager.isValid(ValidProxyProvider.java:107)
	at com.sndo.dmp.ValidProxyProvider$ProxyManager.getValidProxy(ValidProxyProvider.java:87)
	at com.sndo.dmp.ValidProxyProvider$ProxyManager.run(ValidProxyProvider.java:74)
	at java.lang.Thread.run(Thread.java:745)
Caused by: java.net.SocketTimeoutException: connect timed out
	at java.net.DualStackPlainSocketImpl.waitForConnect(Native Method)
	at java.net.DualStackPlainSocketImpl.socketConnect(DualStackPlainSocketImpl.java:85)
	at java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:350)
	at java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:206)
	at java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:188)
	at java.net.PlainSocketImpl.connect(PlainSocketImpl.java:172)
	at java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392)
	at java.net.Socket.connect(Socket.java:589)
	at org.apache.http.conn.socket.PlainConnectionSocketFactory.connectSocket(PlainConnectionSocketFactory.java:74)
	at org.apache.http.impl.conn.DefaultHttpClientConnectionOperator.connect(DefaultHttpClientConnectionOperator.java:141)
	... 13 more
0proxy: Proxy{host='200.89.159.149', port=8000, username='null', password='null'}
1proxy: Proxy{host='124.172.232.49', port=8010, username='null', password='null'}
2proxy: Proxy{host='121.33.220.158', port=808, username='null', password='null'}
3proxy: Proxy{host='195.171.27.244', port=3128, username='null', password='null'}
4proxy: Proxy{host='116.196.90.176', port=3128, username='null', password='null'}
5proxy: Proxy{host='104.248.155.150', port=8080, username='null', password='null'}
6proxy: Proxy{host='118.26.170.209', port=8080, username='null', password='null'}
7proxy: Proxy{host='195.91.166.149', port=3128, username='null', password='null'}
8proxy: Proxy{host='123.139.56.238', port=9999, username='null', password='null'}
0key:Proxy{host='104.248.155.150', port=8080, username='null', password='null'}; value: true
1key:Proxy{host='116.196.90.176', port=3128, username='null', password='null'}; value: true
2key:Proxy{host='195.171.27.244', port=3128, username='null', password='null'}; value: true
3key:Proxy{host='121.33.220.158', port=808, username='null', password='null'}; value: true
4key:Proxy{host='118.26.170.209', port=8080, username='null', password='null'}; value: true
5key:Proxy{host='195.91.166.149', port=3128, username='null', password='null'}; value: true
6key:Proxy{host='200.89.159.149', port=8000, username='null', password='null'}; value: true
7key:Proxy{host='123.139.56.238', port=9999, username='null', password='null'}; value: true
8key:Proxy{host='124.172.232.49', port=8010, username='null', password='null'}; value: true
======================>6
0proxy: Proxy{host='124.172.232.49', port=8010, username='null', password='null'}
1proxy: Proxy{host='121.33.220.158', port=808, username='null', password='null'}
2proxy: Proxy{host='195.171.27.244', port=3128, username='null', password='null'}
3proxy: Proxy{host='116.196.90.176', port=3128, username='null', password='null'}
4proxy: Proxy{host='104.248.155.150', port=8080, username='null', password='null'}
5proxy: Proxy{host='118.26.170.209', port=8080, username='null', password='null'}
6proxy: Proxy{host='195.91.166.149', port=3128, username='null', password='null'}
7proxy: Proxy{host='123.139.56.238', port=9999, username='null', password='null'}
8proxy: Proxy{host='200.89.159.149', port=8000, username='null', password='null'}
0key:Proxy{host='104.248.155.150', port=8080, username='null', password='null'}; value: true
1key:Proxy{host='116.196.90.176', port=3128, username='null', password='null'}; value: true
2key:Proxy{host='195.171.27.244', port=3128, username='null', password='null'}; value: true
3key:Proxy{host='121.33.220.158', port=808, username='null', password='null'}; value: true
4key:Proxy{host='118.26.170.209', port=8080, username='null', password='null'}; value: true
5key:Proxy{host='195.91.166.149', port=3128, username='null', password='null'}; value: true
6key:Proxy{host='200.89.159.149', port=8000, username='null', password='null'}; value: true
7key:Proxy{host='123.139.56.238', port=9999, username='null', password='null'}; value: true
8key:Proxy{host='124.172.232.49', port=8010, username='null', password='null'}; value: true
======================>7
0proxy: Proxy{host='121.33.220.158', port=808, username='null', password='null'}
1proxy: Proxy{host='195.171.27.244', port=3128, username='null', password='null'}
2proxy: Proxy{host='116.196.90.176', port=3128, username='null', password='null'}
3proxy: Proxy{host='104.248.155.150', port=8080, username='null', password='null'}
4proxy: Proxy{host='118.26.170.209', port=8080, username='null', password='null'}
5proxy: Proxy{host='195.91.166.149', port=3128, username='null', password='null'}
6proxy: Proxy{host='123.139.56.238', port=9999, username='null', password='null'}
7proxy: Proxy{host='200.89.159.149', port=8000, username='null', password='null'}
8proxy: Proxy{host='124.172.232.49', port=8010, username='null', password='null'}
0key:Proxy{host='104.248.155.150', port=8080, username='null', password='null'}; value: true
1key:Proxy{host='116.196.90.176', port=3128, username='null', password='null'}; value: true
2key:Proxy{host='195.171.27.244', port=3128, username='null', password='null'}; value: true
3key:Proxy{host='121.33.220.158', port=808, username='null', password='null'}; value: true
4key:Proxy{host='118.26.170.209', port=8080, username='null', password='null'}; value: true
5key:Proxy{host='195.91.166.149', port=3128, username='null', password='null'}; value: true
6key:Proxy{host='200.89.159.149', port=8000, username='null', password='null'}; value: true
7key:Proxy{host='123.139.56.238', port=9999, username='null', password='null'}; value: true
8key:Proxy{host='124.172.232.49', port=8010, username='null', password='null'}; value: true
======================>8
0proxy: Proxy{host='195.171.27.244', port=3128, username='null', password='null'}
1proxy: Proxy{host='116.196.90.176', port=3128, username='null', password='null'}
2proxy: Proxy{host='104.248.155.150', port=8080, username='null', password='null'}
3proxy: Proxy{host='118.26.170.209', port=8080, username='null', password='null'}
4proxy: Proxy{host='195.91.166.149', port=3128, username='null', password='null'}
5proxy: Proxy{host='123.139.56.238', port=9999, username='null', password='null'}
6proxy: Proxy{host='200.89.159.149', port=8000, username='null', password='null'}
7proxy: Proxy{host='124.172.232.49', port=8010, username='null', password='null'}
8proxy: Proxy{host='59.127.168.43', port=3128, username='null', password='null'}
9proxy: Proxy{host='121.33.220.158', port=808, username='null', password='null'}
0key:Proxy{host='104.248.155.150', port=8080, username='null', password='null'}; value: true
1key:Proxy{host='116.196.90.176', port=3128, username='null', password='null'}; value: true
2key:Proxy{host='59.127.168.43', port=3128, username='null', password='null'}; value: true
3key:Proxy{host='195.171.27.244', port=3128, username='null', password='null'}; value: true
4key:Proxy{host='121.33.220.158', port=808, username='null', password='null'}; value: true
5key:Proxy{host='118.26.170.209', port=8080, username='null', password='null'}; value: true
6key:Proxy{host='195.91.166.149', port=3128, username='null', password='null'}; value: true
7key:Proxy{host='200.89.159.149', port=8000, username='null', password='null'}; value: true
8key:Proxy{host='123.139.56.238', port=9999, username='null', password='null'}; value: true
9key:Proxy{host='124.172.232.49', port=8010, username='null', password='null'}; value: true
======================>9
0proxy: Proxy{host='116.196.90.176', port=3128, username='null', password='null'}
1proxy: Proxy{host='104.248.155.150', port=8080, username='null', password='null'}
2proxy: Proxy{host='118.26.170.209', port=8080, username='null', password='null'}
3proxy: Proxy{host='195.91.166.149', port=3128, username='null', password='null'}
4proxy: Proxy{host='123.139.56.238', port=9999, username='null', password='null'}
5proxy: Proxy{host='200.89.159.149', port=8000, username='null', password='null'}
6proxy: Proxy{host='124.172.232.49', port=8010, username='null', password='null'}
7proxy: Proxy{host='59.127.168.43', port=3128, username='null', password='null'}
8proxy: Proxy{host='121.33.220.158', port=808, username='null', password='null'}
0key:Proxy{host='104.248.155.150', port=8080, username='null', password='null'}; value: true
1key:Proxy{host='116.196.90.176', port=3128, username='null', password='null'}; value: true
2key:Proxy{host='59.127.168.43', port=3128, username='null', password='null'}; value: true
3key:Proxy{host='121.33.220.158', port=808, username='null', password='null'}; value: true
4key:Proxy{host='118.26.170.209', port=8080, username='null', password='null'}; value: true
5key:Proxy{host='195.91.166.149', port=3128, username='null', password='null'}; value: true
6key:Proxy{host='200.89.159.149', port=8000, username='null', password='null'}; value: true
7key:Proxy{host='123.139.56.238', port=9999, username='null', password='null'}; value: true
8key:Proxy{host='124.172.232.49', port=8010, username='null', password='null'}; value: true
======================>10
0proxy: Proxy{host='104.248.155.150', port=8080, username='null', password='null'}
1proxy: Proxy{host='118.26.170.209', port=8080, username='null', password='null'}
2proxy: Proxy{host='195.91.166.149', port=3128, username='null', password='null'}
3proxy: Proxy{host='123.139.56.238', port=9999, username='null', password='null'}
4proxy: Proxy{host='200.89.159.149', port=8000, username='null', password='null'}
5proxy: Proxy{host='124.172.232.49', port=8010, username='null', password='null'}
6proxy: Proxy{host='59.127.168.43', port=3128, username='null', password='null'}
7proxy: Proxy{host='121.33.220.158', port=808, username='null', password='null'}
8proxy: Proxy{host='116.196.90.176', port=3128, username='null', password='null'}
0key:Proxy{host='104.248.155.150', port=8080, username='null', password='null'}; value: true
1key:Proxy{host='116.196.90.176', port=3128, username='null', password='null'}; value: true
2key:Proxy{host='59.127.168.43', port=3128, username='null', password='null'}; value: true
3key:Proxy{host='121.33.220.158', port=808, username='null', password='null'}; value: true
4key:Proxy{host='118.26.170.209', port=8080, username='null', password='null'}; value: true
5key:Proxy{host='195.91.166.149', port=3128, username='null', password='null'}; value: true
6key:Proxy{host='200.89.159.149', port=8000, username='null', password='null'}; value: true
7key:Proxy{host='123.139.56.238', port=9999, username='null', password='null'}; value: true
8key:Proxy{host='124.172.232.49', port=8010, username='null', password='null'}; value: true
======================>11
0proxy: Proxy{host='118.26.170.209', port=8080, username='null', password='null'}
1proxy: Proxy{host='195.91.166.149', port=3128, username='null', password='null'}
2proxy: Proxy{host='123.139.56.238', port=9999, username='null', password='null'}
3proxy: Proxy{host='200.89.159.149', port=8000, username='null', password='null'}
4proxy: Proxy{host='124.172.232.49', port=8010, username='null', password='null'}
5proxy: Proxy{host='59.127.168.43', port=3128, username='null', password='null'}
6proxy: Proxy{host='121.33.220.158', port=808, username='null', password='null'}
7proxy: Proxy{host='116.196.90.176', port=3128, username='null', password='null'}
8proxy: Proxy{host='104.248.155.150', port=8080, username='null', password='null'}
0key:Proxy{host='104.248.155.150', port=8080, username='null', password='null'}; value: true
1key:Proxy{host='116.196.90.176', port=3128, username='null', password='null'}; value: true
2key:Proxy{host='59.127.168.43', port=3128, username='null', password='null'}; value: true
3key:Proxy{host='121.33.220.158', port=808, username='null', password='null'}; value: true
4key:Proxy{host='118.26.170.209', port=8080, username='null', password='null'}; value: true
5key:Proxy{host='195.91.166.149', port=3128, username='null', password='null'}; value: true
6key:Proxy{host='200.89.159.149', port=8000, username='null', password='null'}; value: true
7key:Proxy{host='123.139.56.238', port=9999, username='null', password='null'}; value: true
8key:Proxy{host='124.172.232.49', port=8010, username='null', password='null'}; value: true
======================>12
0proxy: Proxy{host='195.91.166.149', port=3128, username='null', password='null'}
1proxy: Proxy{host='123.139.56.238', port=9999, username='null', password='null'}
2proxy: Proxy{host='200.89.159.149', port=8000, username='null', password='null'}
3proxy: Proxy{host='124.172.232.49', port=8010, username='null', password='null'}
4proxy: Proxy{host='59.127.168.43', port=3128, username='null', password='null'}
5proxy: Proxy{host='121.33.220.158', port=808, username='null', password='null'}
6proxy: Proxy{host='116.196.90.176', port=3128, username='null', password='null'}
7proxy: Proxy{host='104.248.155.150', port=8080, username='null', password='null'}
8proxy: Proxy{host='118.26.170.209', port=8080, username='null', password='null'}
0key:Proxy{host='104.248.155.150', port=8080, username='null', password='null'}; value: true
1key:Proxy{host='116.196.90.176', port=3128, username='null', password='null'}; value: true
2key:Proxy{host='59.127.168.43', port=3128, username='null', password='null'}; value: true
3key:Proxy{host='121.33.220.158', port=808, username='null', password='null'}; value: true
4key:Proxy{host='118.26.170.209', port=8080, username='null', password='null'}; value: true
5key:Proxy{host='195.91.166.149', port=3128, username='null', password='null'}; value: true
6key:Proxy{host='200.89.159.149', port=8000, username='null', password='null'}; value: true
7key:Proxy{host='123.139.56.238', port=9999, username='null', password='null'}; value: true
8key:Proxy{host='124.172.232.49', port=8010, username='null', password='null'}; value: true
======================>13
0proxy: Proxy{host='123.139.56.238', port=9999, username='null', password='null'}
1proxy: Proxy{host='200.89.159.149', port=8000, username='null', password='null'}
2proxy: Proxy{host='124.172.232.49', port=8010, username='null', password='null'}
3proxy: Proxy{host='59.127.168.43', port=3128, username='null', password='null'}
4proxy: Proxy{host='121.33.220.158', port=808, username='null', password='null'}
5proxy: Proxy{host='116.196.90.176', port=3128, username='null', password='null'}
6proxy: Proxy{host='104.248.155.150', port=8080, username='null', password='null'}
7proxy: Proxy{host='118.26.170.209', port=8080, username='null', password='null'}
8proxy: Proxy{host='195.91.166.149', port=3128, username='null', password='null'}
0key:Proxy{host='104.248.155.150', port=8080, username='null', password='null'}; value: true
1key:Proxy{host='116.196.90.176', port=3128, username='null', password='null'}; value: true
2key:Proxy{host='59.127.168.43', port=3128, username='null', password='null'}; value: true
3key:Proxy{host='121.33.220.158', port=808, username='null', password='null'}; value: true
4key:Proxy{host='118.26.170.209', port=8080, username='null', password='null'}; value: true
5key:Proxy{host='195.91.166.149', port=3128, username='null', password='null'}; value: true
6key:Proxy{host='200.89.159.149', port=8000, username='null', password='null'}; value: true
7key:Proxy{host='123.139.56.238', port=9999, username='null', password='null'}; value: true
8key:Proxy{host='124.172.232.49', port=8010, username='null', password='null'}; value: true
======================>14
0proxy: Proxy{host='200.89.159.149', port=8000, username='null', password='null'}
1proxy: Proxy{host='124.172.232.49', port=8010, username='null', password='null'}
2proxy: Proxy{host='59.127.168.43', port=3128, username='null', password='null'}
3proxy: Proxy{host='121.33.220.158', port=808, username='null', password='null'}
4proxy: Proxy{host='116.196.90.176', port=3128, username='null', password='null'}
5proxy: Proxy{host='104.248.155.150', port=8080, username='null', password='null'}
6proxy: Proxy{host='118.26.170.209', port=8080, username='null', password='null'}
7proxy: Proxy{host='195.91.166.149', port=3128, username='null', password='null'}
8proxy: Proxy{host='123.139.56.238', port=9999, username='null', password='null'}
0key:Proxy{host='104.248.155.150', port=8080, username='null', password='null'}; value: true
1key:Proxy{host='116.196.90.176', port=3128, username='null', password='null'}; value: true
2key:Proxy{host='59.127.168.43', port=3128, username='null', password='null'}; value: true
3key:Proxy{host='121.33.220.158', port=808, username='null', password='null'}; value: true
4key:Proxy{host='118.26.170.209', port=8080, username='null', password='null'}; value: true
5key:Proxy{host='195.91.166.149', port=3128, username='null', password='null'}; value: true
6key:Proxy{host='200.89.159.149', port=8000, username='null', password='null'}; value: true
7key:Proxy{host='123.139.56.238', port=9999, username='null', password='null'}; value: true
8key:Proxy{host='124.172.232.49', port=8010, username='null', password='null'}; value: true
======================>15
org.apache.http.conn.ConnectTimeoutException: Connect to 200.89.174.142:3128 [/200.89.174.142] failed: connect timed out
	at org.apache.http.impl.conn.DefaultHttpClientConnectionOperator.connect(DefaultHttpClientConnectionOperator.java:150)
	at org.apache.http.impl.conn.PoolingHttpClientConnectionManager.connect(PoolingHttpClientConnectionManager.java:353)
	at org.apache.http.impl.execchain.MainClientExec.establishRoute(MainClientExec.java:388)
	at org.apache.http.impl.execchain.MainClientExec.execute(MainClientExec.java:236)
	at org.apache.http.impl.execchain.ProtocolExec.execute(ProtocolExec.java:184)
	at org.apache.http.impl.execchain.RetryExec.execute(RetryExec.java:88)
	at org.apache.http.impl.execchain.RedirectExec.execute(RedirectExec.java:110)
	at org.apache.http.impl.client.InternalHttpClient.doExecute(InternalHttpClient.java:184)
	at org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:82)
	at com.sndo.dmp.util.ProxyUtils.isValid(ProxyUtils.java:26)
	at com.sndo.dmp.ValidProxyProvider$ProxyManager.isValid(ValidProxyProvider.java:107)
	at com.sndo.dmp.ValidProxyProvider$ProxyManager.getValidProxy(ValidProxyProvider.java:87)
	at com.sndo.dmp.ValidProxyProvider$ProxyManager.run(ValidProxyProvider.java:74)
	at java.lang.Thread.run(Thread.java:745)
Caused by: java.net.SocketTimeoutException: connect timed out
	at java.net.DualStackPlainSocketImpl.waitForConnect(Native Method)
	at java.net.DualStackPlainSocketImpl.socketConnect(DualStackPlainSocketImpl.java:85)
	at java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:350)
	at java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:206)
	at java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:188)
	at java.net.PlainSocketImpl.connect(PlainSocketImpl.java:172)
	at java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392)
	at java.net.Socket.connect(Socket.java:589)
	at org.apache.http.conn.socket.PlainConnectionSocketFactory.connectSocket(PlainConnectionSocketFactory.java:74)
	at org.apache.http.impl.conn.DefaultHttpClientConnectionOperator.connect(DefaultHttpClientConnectionOperator.java:141)
	... 13 more
0proxy: Proxy{host='124.172.232.49', port=8010, username='null', password='null'}
1proxy: Proxy{host='59.127.168.43', port=3128, username='null', password='null'}
2proxy: Proxy{host='121.33.220.158', port=808, username='null', password='null'}
3proxy: Proxy{host='116.196.90.176', port=3128, username='null', password='null'}
4proxy: Proxy{host='104.248.155.150', port=8080, username='null', password='null'}
5proxy: Proxy{host='118.26.170.209', port=8080, username='null', password='null'}
6proxy: Proxy{host='195.91.166.149', port=3128, username='null', password='null'}
7proxy: Proxy{host='123.139.56.238', port=9999, username='null', password='null'}
8proxy: Proxy{host='200.89.159.149', port=8000, username='null', password='null'}
0key:Proxy{host='104.248.155.150', port=8080, username='null', password='null'}; value: true
1key:Proxy{host='116.196.90.176', port=3128, username='null', password='null'}; value: true
2key:Proxy{host='59.127.168.43', port=3128, username='null', password='null'}; value: true
3key:Proxy{host='121.33.220.158', port=808, username='null', password='null'}; value: true
4key:Proxy{host='118.26.170.209', port=8080, username='null', password='null'}; value: true
5key:Proxy{host='195.91.166.149', port=3128, username='null', password='null'}; value: true
6key:Proxy{host='200.89.159.149', port=8000, username='null', password='null'}; value: true
7key:Proxy{host='123.139.56.238', port=9999, username='null', password='null'}; value: true
8key:Proxy{host='124.172.232.49', port=8010, username='null', password='null'}; value: true
======================>16
0proxy: Proxy{host='59.127.168.43', port=3128, username='null', password='null'}
1proxy: Proxy{host='121.33.220.158', port=808, username='null', password='null'}
2proxy: Proxy{host='116.196.90.176', port=3128, username='null', password='null'}
3proxy: Proxy{host='104.248.155.150', port=8080, username='null', password='null'}
4proxy: Proxy{host='118.26.170.209', port=8080, username='null', password='null'}
5proxy: Proxy{host='195.91.166.149', port=3128, username='null', password='null'}
6proxy: Proxy{host='123.139.56.238', port=9999, username='null', password='null'}
7proxy: Proxy{host='200.89.159.149', port=8000, username='null', password='null'}
8proxy: Proxy{host='124.172.232.49', port=8010, username='null', password='null'}
0key:Proxy{host='104.248.155.150', port=8080, username='null', password='null'}; value: true
1key:Proxy{host='116.196.90.176', port=3128, username='null', password='null'}; value: true
2key:Proxy{host='59.127.168.43', port=3128, username='null', password='null'}; value: true
3key:Proxy{host='121.33.220.158', port=808, username='null', password='null'}; value: true
4key:Proxy{host='118.26.170.209', port=8080, username='null', password='null'}; value: true
5key:Proxy{host='195.91.166.149', port=3128, username='null', password='null'}; value: true
6key:Proxy{host='200.89.159.149', port=8000, username='null', password='null'}; value: true
7key:Proxy{host='123.139.56.238', port=9999, username='null', password='null'}; value: true
8key:Proxy{host='124.172.232.49', port=8010, username='null', password='null'}; value: true
======================>17
0proxy: Proxy{host='121.33.220.158', port=808, username='null', password='null'}
1proxy: Proxy{host='116.196.90.176', port=3128, username='null', password='null'}
2proxy: Proxy{host='104.248.155.150', port=8080, username='null', password='null'}
3proxy: Proxy{host='118.26.170.209', port=8080, username='null', password='null'}
4proxy: Proxy{host='195.91.166.149', port=3128, username='null', password='null'}
5proxy: Proxy{host='123.139.56.238', port=9999, username='null', password='null'}
6proxy: Proxy{host='200.89.159.149', port=8000, username='null', password='null'}
7proxy: Proxy{host='124.172.232.49', port=8010, username='null', password='null'}
8proxy: Proxy{host='59.127.168.43', port=3128, username='null', password='null'}
0key:Proxy{host='104.248.155.150', port=8080, username='null', password='null'}; value: true
1key:Proxy{host='116.196.90.176', port=3128, username='null', password='null'}; value: true
2key:Proxy{host='59.127.168.43', port=3128, username='null', password='null'}; value: true
3key:Proxy{host='121.33.220.158', port=808, username='null', password='null'}; value: true
4key:Proxy{host='118.26.170.209', port=8080, username='null', password='null'}; value: true
5key:Proxy{host='195.91.166.149', port=3128, username='null', password='null'}; value: true
6key:Proxy{host='200.89.159.149', port=8000, username='null', password='null'}; value: true
7key:Proxy{host='123.139.56.238', port=9999, username='null', password='null'}; value: true
8key:Proxy{host='124.172.232.49', port=8010, username='null', password='null'}; value: true
======================>18
0proxy: Proxy{host='116.196.90.176', port=3128, username='null', password='null'}
1proxy: Proxy{host='104.248.155.150', port=8080, username='null', password='null'}
2proxy: Proxy{host='118.26.170.209', port=8080, username='null', password='null'}
3proxy: Proxy{host='195.91.166.149', port=3128, username='null', password='null'}
4proxy: Proxy{host='123.139.56.238', port=9999, username='null', password='null'}
5proxy: Proxy{host='200.89.159.149', port=8000, username='null', password='null'}
6proxy: Proxy{host='124.172.232.49', port=8010, username='null', password='null'}
7proxy: Proxy{host='59.127.168.43', port=3128, username='null', password='null'}
8proxy: Proxy{host='121.33.220.158', port=808, username='null', password='null'}
0key:Proxy{host='104.248.155.150', port=8080, username='null', password='null'}; value: true
1key:Proxy{host='116.196.90.176', port=3128, username='null', password='null'}; value: true
2key:Proxy{host='59.127.168.43', port=3128, username='null', password='null'}; value: true
3key:Proxy{host='121.33.220.158', port=808, username='null', password='null'}; value: true
4key:Proxy{host='118.26.170.209', port=8080, username='null', password='null'}; value: true
5key:Proxy{host='195.91.166.149', port=3128, username='null', password='null'}; value: true
6key:Proxy{host='200.89.159.149', port=8000, username='null', password='null'}; value: true
7key:Proxy{host='123.139.56.238', port=9999, username='null', password='null'}; value: true
8key:Proxy{host='124.172.232.49', port=8010, username='null', password='null'}; value: true
======================>19
0proxy: Proxy{host='104.248.155.150', port=8080, username='null', password='null'}
1proxy: Proxy{host='118.26.170.209', port=8080, username='null', password='null'}
2proxy: Proxy{host='195.91.166.149', port=3128, username='null', password='null'}
3proxy: Proxy{host='123.139.56.238', port=9999, username='null', password='null'}
4proxy: Proxy{host='200.89.159.149', port=8000, username='null', password='null'}
5proxy: Proxy{host='124.172.232.49', port=8010, username='null', password='null'}
6proxy: Proxy{host='59.127.168.43', port=3128, username='null', password='null'}
7proxy: Proxy{host='121.33.220.158', port=808, username='null', password='null'}
0key:Proxy{host='104.248.155.150', port=8080, username='null', password='null'}; value: true
1key:Proxy{host='116.196.90.176', port=3128, username='null', password='null'}; value: false
2key:Proxy{host='59.127.168.43', port=3128, username='null', password='null'}; value: true
3key:Proxy{host='121.33.220.158', port=808, username='null', password='null'}; value: true
4key:Proxy{host='118.26.170.209', port=8080, username='null', password='null'}; value: true
5key:Proxy{host='195.91.166.149', port=3128, username='null', password='null'}; value: true
6key:Proxy{host='200.89.159.149', port=8000, username='null', password='null'}; value: true
7key:Proxy{host='123.139.56.238', port=9999, username='null', password='null'}; value: true
8key:Proxy{host='124.172.232.49', port=8010, username='null', password='null'}; value: true
======================>20
java.net.SocketTimeoutException: Read timed out
	at java.net.SocketInputStream.socketRead0(Native Method)
	at java.net.SocketInputStream.socketRead(SocketInputStream.java:116)
	at java.net.SocketInputStream.read(SocketInputStream.java:170)
	at java.net.SocketInputStream.read(SocketInputStream.java:141)
	at org.apache.http.impl.io.SessionInputBufferImpl.streamRead(SessionInputBufferImpl.java:139)
	at org.apache.http.impl.io.SessionInputBufferImpl.fillBuffer(SessionInputBufferImpl.java:155)
	at org.apache.http.impl.io.SessionInputBufferImpl.readLine(SessionInputBufferImpl.java:284)
	at org.apache.http.impl.conn.DefaultHttpResponseParser.parseHead(DefaultHttpResponseParser.java:140)
	at org.apache.http.impl.conn.DefaultHttpResponseParser.parseHead(DefaultHttpResponseParser.java:57)
	at org.apache.http.impl.io.AbstractMessageParser.parse(AbstractMessageParser.java:261)
	at org.apache.http.impl.DefaultBHttpClientConnection.receiveResponseHeader(DefaultBHttpClientConnection.java:165)
	at org.apache.http.impl.conn.CPoolProxy.receiveResponseHeader(CPoolProxy.java:167)
	at org.apache.http.protocol.HttpRequestExecutor.doReceiveResponse(HttpRequestExecutor.java:272)
	at org.apache.http.protocol.HttpRequestExecutor.execute(HttpRequestExecutor.java:124)
	at org.apache.http.impl.execchain.MainClientExec.createTunnelToTarget(MainClientExec.java:472)
	at org.apache.http.impl.execchain.MainClientExec.establishRoute(MainClientExec.java:397)
	at org.apache.http.impl.execchain.MainClientExec.execute(MainClientExec.java:236)
	at org.apache.http.impl.execchain.ProtocolExec.execute(ProtocolExec.java:184)
	at org.apache.http.impl.execchain.RetryExec.execute(RetryExec.java:88)
	at org.apache.http.impl.execchain.RedirectExec.execute(RedirectExec.java:110)
	at org.apache.http.impl.client.InternalHttpClient.doExecute(InternalHttpClient.java:184)
	at org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:82)
	at com.sndo.dmp.util.ProxyUtils.isValid(ProxyUtils.java:26)
	at com.sndo.dmp.ValidProxyProvider$ProxyManager.isValid(ValidProxyProvider.java:107)
	at com.sndo.dmp.ValidProxyProvider$ProxyManager.getValidProxy(ValidProxyProvider.java:87)
	at com.sndo.dmp.ValidProxyProvider$ProxyManager.run(ValidProxyProvider.java:74)
	at java.lang.Thread.run(Thread.java:745)
0proxy: Proxy{host='118.26.170.209', port=8080, username='null', password='null'}
1proxy: Proxy{host='195.91.166.149', port=3128, username='null', password='null'}
2proxy: Proxy{host='123.139.56.238', port=9999, username='null', password='null'}
3proxy: Proxy{host='200.89.159.149', port=8000, username='null', password='null'}
4proxy: Proxy{host='124.172.232.49', port=8010, username='null', password='null'}
5proxy: Proxy{host='59.127.168.43', port=3128, username='null', password='null'}
6proxy: Proxy{host='121.33.220.158', port=808, username='null', password='null'}
7proxy: Proxy{host='104.248.155.150', port=8080, username='null', password='null'}
0key:Proxy{host='104.248.155.150', port=8080, username='null', password='null'}; value: true
1key:Proxy{host='116.196.90.176', port=3128, username='null', password='null'}; value: false
2key:Proxy{host='59.127.168.43', port=3128, username='null', password='null'}; value: true
3key:Proxy{host='121.33.220.158', port=808, username='null', password='null'}; value: true
4key:Proxy{host='118.26.170.209', port=8080, username='null', password='null'}; value: true
5key:Proxy{host='195.91.166.149', port=3128, username='null', password='null'}; value: true
6key:Proxy{host='200.89.159.149', port=8000, username='null', password='null'}; value: true
7key:Proxy{host='123.139.56.238', port=9999, username='null', password='null'}; value: true
8key:Proxy{host='124.172.232.49', port=8010, username='null', password='null'}; value: true
======================>21
0proxy: Proxy{host='195.91.166.149', port=3128, username='null', password='null'}
1proxy: Proxy{host='123.139.56.238', port=9999, username='null', password='null'}
2proxy: Proxy{host='200.89.159.149', port=8000, username='null', password='null'}
3proxy: Proxy{host='124.172.232.49', port=8010, username='null', password='null'}
4proxy: Proxy{host='59.127.168.43', port=3128, username='null', password='null'}
5proxy: Proxy{host='121.33.220.158', port=808, username='null', password='null'}
6proxy: Proxy{host='104.248.155.150', port=8080, username='null', password='null'}
7proxy: Proxy{host='222.175.171.6', port=8080, username='null', password='null'}
8proxy: Proxy{host='118.26.170.209', port=8080, username='null', password='null'}
0key:Proxy{host='104.248.155.150', port=8080, username='null', password='null'}; value: true
1key:Proxy{host='59.127.168.43', port=3128, username='null', password='null'}; value: true
2key:Proxy{host='222.175.171.6', port=8080, username='null', password='null'}; value: true
3key:Proxy{host='121.33.220.158', port=808, username='null', password='null'}; value: true
4key:Proxy{host='118.26.170.209', port=8080, username='null', password='null'}; value: true
5key:Proxy{host='195.91.166.149', port=3128, username='null', password='null'}; value: true
6key:Proxy{host='200.89.159.149', port=8000, username='null', password='null'}; value: true
7key:Proxy{host='123.139.56.238', port=9999, username='null', password='null'}; value: true
8key:Proxy{host='124.172.232.49', port=8010, username='null', password='null'}; value: true
======================>22
0proxy: Proxy{host='123.139.56.238', port=9999, username='null', password='null'}
1proxy: Proxy{host='200.89.159.149', port=8000, username='null', password='null'}
2proxy: Proxy{host='124.172.232.49', port=8010, username='null', password='null'}
3proxy: Proxy{host='59.127.168.43', port=3128, username='null', password='null'}
4proxy: Proxy{host='121.33.220.158', port=808, username='null', password='null'}
5proxy: Proxy{host='104.248.155.150', port=8080, username='null', password='null'}
6proxy: Proxy{host='222.175.171.6', port=8080, username='null', password='null'}
7proxy: Proxy{host='118.26.170.209', port=8080, username='null', password='null'}
8proxy: Proxy{host='195.91.166.149', port=3128, username='null', password='null'}
0key:Proxy{host='104.248.155.150', port=8080, username='null', password='null'}; value: true
1key:Proxy{host='59.127.168.43', port=3128, username='null', password='null'}; value: true
2key:Proxy{host='222.175.171.6', port=8080, username='null', password='null'}; value: true
3key:Proxy{host='121.33.220.158', port=808, username='null', password='null'}; value: true
4key:Proxy{host='118.26.170.209', port=8080, username='null', password='null'}; value: true
5key:Proxy{host='195.91.166.149', port=3128, username='null', password='null'}; value: true
6key:Proxy{host='200.89.159.149', port=8000, username='null', password='null'}; value: true
7key:Proxy{host='123.139.56.238', port=9999, username='null', password='null'}; value: true
8key:Proxy{host='124.172.232.49', port=8010, username='null', password='null'}; value: true
======================>23
0proxy: Proxy{host='200.89.159.149', port=8000, username='null', password='null'}
1proxy: Proxy{host='124.172.232.49', port=8010, username='null', password='null'}
2proxy: Proxy{host='59.127.168.43', port=3128, username='null', password='null'}
3proxy: Proxy{host='121.33.220.158', port=808, username='null', password='null'}
4proxy: Proxy{host='104.248.155.150', port=8080, username='null', password='null'}
5proxy: Proxy{host='222.175.171.6', port=8080, username='null', password='null'}
6proxy: Proxy{host='118.26.170.209', port=8080, username='null', password='null'}
7proxy: Proxy{host='195.91.166.149', port=3128, username='null', password='null'}
8proxy: Proxy{host='123.139.56.238', port=9999, username='null', password='null'}
0key:Proxy{host='104.248.155.150', port=8080, username='null', password='null'}; value: true
1key:Proxy{host='59.127.168.43', port=3128, username='null', password='null'}; value: true
2key:Proxy{host='222.175.171.6', port=8080, username='null', password='null'}; value: true
3key:Proxy{host='121.33.220.158', port=808, username='null', password='null'}; value: true
4key:Proxy{host='118.26.170.209', port=8080, username='null', password='null'}; value: true
5key:Proxy{host='195.91.166.149', port=3128, username='null', password='null'}; value: true
6key:Proxy{host='200.89.159.149', port=8000, username='null', password='null'}; value: true
7key:Proxy{host='123.139.56.238', port=9999, username='null', password='null'}; value: true
8key:Proxy{host='124.172.232.49', port=8010, username='null', password='null'}; value: true
======================>24
0proxy: Proxy{host='124.172.232.49', port=8010, username='null', password='null'}
1proxy: Proxy{host='59.127.168.43', port=3128, username='null', password='null'}
2proxy: Proxy{host='121.33.220.158', port=808, username='null', password='null'}
3proxy: Proxy{host='104.248.155.150', port=8080, username='null', password='null'}
4proxy: Proxy{host='222.175.171.6', port=8080, username='null', password='null'}
5proxy: Proxy{host='118.26.170.209', port=8080, username='null', password='null'}
6proxy: Proxy{host='195.91.166.149', port=3128, username='null', password='null'}
7proxy: Proxy{host='123.139.56.238', port=9999, username='null', password='null'}
8proxy: Proxy{host='200.89.159.149', port=8000, username='null', password='null'}
0key:Proxy{host='104.248.155.150', port=8080, username='null', password='null'}; value: true
1key:Proxy{host='59.127.168.43', port=3128, username='null', password='null'}; value: true
2key:Proxy{host='222.175.171.6', port=8080, username='null', password='null'}; value: true
3key:Proxy{host='121.33.220.158', port=808, username='null', password='null'}; value: true
4key:Proxy{host='118.26.170.209', port=8080, username='null', password='null'}; value: true
5key:Proxy{host='195.91.166.149', port=3128, username='null', password='null'}; value: true
6key:Proxy{host='200.89.159.149', port=8000, username='null', password='null'}; value: true
7key:Proxy{host='123.139.56.238', port=9999, username='null', password='null'}; value: true
8key:Proxy{host='124.172.232.49', port=8010, username='null', password='null'}; value: true
======================>25
0proxy: Proxy{host='59.127.168.43', port=3128, username='null', password='null'}
1proxy: Proxy{host='121.33.220.158', port=808, username='null', password='null'}
2proxy: Proxy{host='104.248.155.150', port=8080, username='null', password='null'}
3proxy: Proxy{host='222.175.171.6', port=8080, username='null', password='null'}
4proxy: Proxy{host='118.26.170.209', port=8080, username='null', password='null'}
5proxy: Proxy{host='195.91.166.149', port=3128, username='null', password='null'}
6proxy: Proxy{host='123.139.56.238', port=9999, username='null', password='null'}
7proxy: Proxy{host='200.89.159.149', port=8000, username='null', password='null'}
8proxy: Proxy{host='124.172.232.49', port=8010, username='null', password='null'}
0key:Proxy{host='104.248.155.150', port=8080, username='null', password='null'}; value: true
1key:Proxy{host='59.127.168.43', port=3128, username='null', password='null'}; value: true
2key:Proxy{host='222.175.171.6', port=8080, username='null', password='null'}; value: true
3key:Proxy{host='121.33.220.158', port=808, username='null', password='null'}; value: true
4key:Proxy{host='118.26.170.209', port=8080, username='null', password='null'}; value: true
5key:Proxy{host='195.91.166.149', port=3128, username='null', password='null'}; value: true
6key:Proxy{host='200.89.159.149', port=8000, username='null', password='null'}; value: true
7key:Proxy{host='123.139.56.238', port=9999, username='null', password='null'}; value: true
8key:Proxy{host='124.172.232.49', port=8010, username='null', password='null'}; value: true
======================>26
0proxy: Proxy{host='121.33.220.158', port=808, username='null', password='null'}
1proxy: Proxy{host='104.248.155.150', port=8080, username='null', password='null'}
2proxy: Proxy{host='222.175.171.6', port=8080, username='null', password='null'}
3proxy: Proxy{host='118.26.170.209', port=8080, username='null', password='null'}
4proxy: Proxy{host='195.91.166.149', port=3128, username='null', password='null'}
5proxy: Proxy{host='123.139.56.238', port=9999, username='null', password='null'}
6proxy: Proxy{host='200.89.159.149', port=8000, username='null', password='null'}
7proxy: Proxy{host='124.172.232.49', port=8010, username='null', password='null'}
8proxy: Proxy{host='5.196.132.118', port=3128, username='null', password='null'}
9proxy: Proxy{host='59.127.168.43', port=3128, username='null', password='null'}
0key:Proxy{host='104.248.155.150', port=8080, username='null', password='null'}; value: true
1key:Proxy{host='59.127.168.43', port=3128, username='null', password='null'}; value: true
2key:Proxy{host='222.175.171.6', port=8080, username='null', password='null'}; value: true
3key:Proxy{host='5.196.132.118', port=3128, username='null', password='null'}; value: true
4key:Proxy{host='121.33.220.158', port=808, username='null', password='null'}; value: true
5key:Proxy{host='118.26.170.209', port=8080, username='null', password='null'}; value: true
6key:Proxy{host='195.91.166.149', port=3128, username='null', password='null'}; value: true
7key:Proxy{host='200.89.159.149', port=8000, username='null', password='null'}; value: true
8key:Proxy{host='123.139.56.238', port=9999, username='null', password='null'}; value: true
9key:Proxy{host='124.172.232.49', port=8010, username='null', password='null'}; value: true
======================>27
0proxy: Proxy{host='104.248.155.150', port=8080, username='null', password='null'}
1proxy: Proxy{host='222.175.171.6', port=8080, username='null', password='null'}
2proxy: Proxy{host='118.26.170.209', port=8080, username='null', password='null'}
3proxy: Proxy{host='195.91.166.149', port=3128, username='null', password='null'}
4proxy: Proxy{host='123.139.56.238', port=9999, username='null', password='null'}
5proxy: Proxy{host='200.89.159.149', port=8000, username='null', password='null'}
6proxy: Proxy{host='124.172.232.49', port=8010, username='null', password='null'}
7proxy: Proxy{host='5.196.132.118', port=3128, username='null', password='null'}
8proxy: Proxy{host='59.127.168.43', port=3128, username='null', password='null'}
9proxy: Proxy{host='121.33.220.158', port=808, username='null', password='null'}
0key:Proxy{host='104.248.155.150', port=8080, username='null', password='null'}; value: true
1key:Proxy{host='59.127.168.43', port=3128, username='null', password='null'}; value: true
2key:Proxy{host='222.175.171.6', port=8080, username='null', password='null'}; value: true
3key:Proxy{host='5.196.132.118', port=3128, username='null', password='null'}; value: true
4key:Proxy{host='121.33.220.158', port=808, username='null', password='null'}; value: true
5key:Proxy{host='118.26.170.209', port=8080, username='null', password='null'}; value: true
6key:Proxy{host='195.91.166.149', port=3128, username='null', password='null'}; value: true
7key:Proxy{host='200.89.159.149', port=8000, username='null', password='null'}; value: true
8key:Proxy{host='123.139.56.238', port=9999, username='null', password='null'}; value: true
9key:Proxy{host='124.172.232.49', port=8010, username='null', password='null'}; value: true
======================>28
0proxy: Proxy{host='222.175.171.6', port=8080, username='null', password='null'}
1proxy: Proxy{host='118.26.170.209', port=8080, username='null', password='null'}
2proxy: Proxy{host='195.91.166.149', port=3128, username='null', password='null'}
3proxy: Proxy{host='123.139.56.238', port=9999, username='null', password='null'}
4proxy: Proxy{host='200.89.159.149', port=8000, username='null', password='null'}
5proxy: Proxy{host='124.172.232.49', port=8010, username='null', password='null'}
6proxy: Proxy{host='5.196.132.118', port=3128, username='null', password='null'}
7proxy: Proxy{host='59.127.168.43', port=3128, username='null', password='null'}
8proxy: Proxy{host='121.33.220.158', port=808, username='null', password='null'}
9proxy: Proxy{host='104.248.155.150', port=8080, username='null', password='null'}
0key:Proxy{host='104.248.155.150', port=8080, username='null', password='null'}; value: true
1key:Proxy{host='59.127.168.43', port=3128, username='null', password='null'}; value: true
2key:Proxy{host='222.175.171.6', port=8080, username='null', password='null'}; value: true
3key:Proxy{host='5.196.132.118', port=3128, username='null', password='null'}; value: true
4key:Proxy{host='121.33.220.158', port=808, username='null', password='null'}; value: true
5key:Proxy{host='118.26.170.209', port=8080, username='null', password='null'}; value: true
6key:Proxy{host='195.91.166.149', port=3128, username='null', password='null'}; value: true
7key:Proxy{host='200.89.159.149', port=8000, username='null', password='null'}; value: true
8key:Proxy{host='123.139.56.238', port=9999, username='null', password='null'}; value: true
9key:Proxy{host='124.172.232.49', port=8010, username='null', password='null'}; value: true
======================>29
0proxy: Proxy{host='118.26.170.209', port=8080, username='null', password='null'}
1proxy: Proxy{host='195.91.166.149', port=3128, username='null', password='null'}
2proxy: Proxy{host='123.139.56.238', port=9999, username='null', password='null'}
3proxy: Proxy{host='200.89.159.149', port=8000, username='null', password='null'}
4proxy: Proxy{host='124.172.232.49', port=8010, username='null', password='null'}
5proxy: Proxy{host='5.196.132.118', port=3128, username='null', password='null'}
6proxy: Proxy{host='59.127.168.43', port=3128, username='null', password='null'}
7proxy: Proxy{host='121.33.220.158', port=808, username='null', password='null'}
8proxy: Proxy{host='104.248.155.150', port=8080, username='null', password='null'}
0key:Proxy{host='104.248.155.150', port=8080, username='null', password='null'}; value: true
1key:Proxy{host='59.127.168.43', port=3128, username='null', password='null'}; value: true
2key:Proxy{host='5.196.132.118', port=3128, username='null', password='null'}; value: true
3key:Proxy{host='121.33.220.158', port=808, username='null', password='null'}; value: true
4key:Proxy{host='118.26.170.209', port=8080, username='null', password='null'}; value: true
5key:Proxy{host='195.91.166.149', port=3128, username='null', password='null'}; value: true
6key:Proxy{host='200.89.159.149', port=8000, username='null', password='null'}; value: true
7key:Proxy{host='123.139.56.238', port=9999, username='null', password='null'}; value: true
8key:Proxy{host='124.172.232.49', port=8010, username='null', password='null'}; value: true
======================>30
0proxy: Proxy{host='195.91.166.149', port=3128, username='null', password='null'}
1proxy: Proxy{host='123.139.56.238', port=9999, username='null', password='null'}
2proxy: Proxy{host='200.89.159.149', port=8000, username='null', password='null'}
3proxy: Proxy{host='124.172.232.49', port=8010, username='null', password='null'}
4proxy: Proxy{host='5.196.132.118', port=3128, username='null', password='null'}
5proxy: Proxy{host='59.127.168.43', port=3128, username='null', password='null'}
6proxy: Proxy{host='121.33.220.158', port=808, username='null', password='null'}
7proxy: Proxy{host='104.248.155.150', port=8080, username='null', password='null'}
8proxy: Proxy{host='118.26.170.209', port=8080, username='null', password='null'}
0key:Proxy{host='104.248.155.150', port=8080, username='null', password='null'}; value: true
1key:Proxy{host='59.127.168.43', port=3128, username='null', password='null'}; value: true
2key:Proxy{host='5.196.132.118', port=3128, username='null', password='null'}; value: true
3key:Proxy{host='121.33.220.158', port=808, username='null', password='null'}; value: true
4key:Proxy{host='118.26.170.209', port=8080, username='null', password='null'}; value: true
5key:Proxy{host='195.91.166.149', port=3128, username='null', password='null'}; value: true
6key:Proxy{host='200.89.159.149', port=8000, username='null', password='null'}; value: true
7key:Proxy{host='123.139.56.238', port=9999, username='null', password='null'}; value: true
8key:Proxy{host='124.172.232.49', port=8010, username='null', password='null'}; value: true
======================>31
0proxy: Proxy{host='123.139.56.238', port=9999, username='null', password='null'}
1proxy: Proxy{host='200.89.159.149', port=8000, username='null', password='null'}
2proxy: Proxy{host='124.172.232.49', port=8010, username='null', password='null'}
3proxy: Proxy{host='5.196.132.118', port=3128, username='null', password='null'}
4proxy: Proxy{host='59.127.168.43', port=3128, username='null', password='null'}
5proxy: Proxy{host='121.33.220.158', port=808, username='null', password='null'}
6proxy: Proxy{host='104.248.155.150', port=8080, username='null', password='null'}
7proxy: Proxy{host='118.26.170.209', port=8080, username='null', password='null'}
8proxy: Proxy{host='195.91.166.149', port=3128, username='null', password='null'}
0key:Proxy{host='104.248.155.150', port=8080, username='null', password='null'}; value: true
1key:Proxy{host='59.127.168.43', port=3128, username='null', password='null'}; value: true
2key:Proxy{host='5.196.132.118', port=3128, username='null', password='null'}; value: true
3key:Proxy{host='121.33.220.158', port=808, username='null', password='null'}; value: true
4key:Proxy{host='118.26.170.209', port=8080, username='null', password='null'}; value: true
5key:Proxy{host='195.91.166.149', port=3128, username='null', password='null'}; value: true
6key:Proxy{host='200.89.159.149', port=8000, username='null', password='null'}; value: true
7key:Proxy{host='123.139.56.238', port=9999, username='null', password='null'}; value: true
8key:Proxy{host='124.172.232.49', port=8010, username='null', password='null'}; value: true
======================>32
0proxy: Proxy{host='200.89.159.149', port=8000, username='null', password='null'}
1proxy: Proxy{host='124.172.232.49', port=8010, username='null', password='null'}
2proxy: Proxy{host='5.196.132.118', port=3128, username='null', password='null'}
3proxy: Proxy{host='59.127.168.43', port=3128, username='null', password='null'}
4proxy: Proxy{host='121.33.220.158', port=808, username='null', password='null'}
5proxy: Proxy{host='104.248.155.150', port=8080, username='null', password='null'}
6proxy: Proxy{host='118.26.170.209', port=8080, username='null', password='null'}
7proxy: Proxy{host='195.91.166.149', port=3128, username='null', password='null'}
8proxy: Proxy{host='123.139.56.238', port=9999, username='null', password='null'}
0key:Proxy{host='104.248.155.150', port=8080, username='null', password='null'}; value: true
1key:Proxy{host='59.127.168.43', port=3128, username='null', password='null'}; value: true
2key:Proxy{host='5.196.132.118', port=3128, username='null', password='null'}; value: true
3key:Proxy{host='121.33.220.158', port=808, username='null', password='null'}; value: true
4key:Proxy{host='118.26.170.209', port=8080, username='null', password='null'}; value: true
5key:Proxy{host='195.91.166.149', port=3128, username='null', password='null'}; value: true
6key:Proxy{host='200.89.159.149', port=8000, username='null', password='null'}; value: true
7key:Proxy{host='123.139.56.238', port=9999, username='null', password='null'}; value: true
8key:Proxy{host='124.172.232.49', port=8010, username='null', password='null'}; value: true
======================>33
0proxy: Proxy{host='124.172.232.49', port=8010, username='null', password='null'}
1proxy: Proxy{host='5.196.132.118', port=3128, username='null', password='null'}
2proxy: Proxy{host='59.127.168.43', port=3128, username='null', password='null'}
3proxy: Proxy{host='121.33.220.158', port=808, username='null', password='null'}
4proxy: Proxy{host='104.248.155.150', port=8080, username='null', password='null'}
5proxy: Proxy{host='118.26.170.209', port=8080, username='null', password='null'}
6proxy: Proxy{host='195.91.166.149', port=3128, username='null', password='null'}
7proxy: Proxy{host='123.139.56.238', port=9999, username='null', password='null'}
8proxy: Proxy{host='200.89.159.149', port=8000, username='null', password='null'}
0key:Proxy{host='104.248.155.150', port=8080, username='null', password='null'}; value: true
1key:Proxy{host='59.127.168.43', port=3128, username='null', password='null'}; value: true
2key:Proxy{host='5.196.132.118', port=3128, username='null', password='null'}; value: true
3key:Proxy{host='121.33.220.158', port=808, username='null', password='null'}; value: true
4key:Proxy{host='118.26.170.209', port=8080, username='null', password='null'}; value: true
5key:Proxy{host='195.91.166.149', port=3128, username='null', password='null'}; value: true
6key:Proxy{host='200.89.159.149', port=8000, username='null', password='null'}; value: true
7key:Proxy{host='123.139.56.238', port=9999, username='null', password='null'}; value: true
8key:Proxy{host='124.172.232.49', port=8010, username='null', password='null'}; value: true
======================>34
0proxy: Proxy{host='5.196.132.118', port=3128, username='null', password='null'}
1proxy: Proxy{host='59.127.168.43', port=3128, username='null', password='null'}
2proxy: Proxy{host='121.33.220.158', port=808, username='null', password='null'}
3proxy: Proxy{host='104.248.155.150', port=8080, username='null', password='null'}
4proxy: Proxy{host='118.26.170.209', port=8080, username='null', password='null'}
5proxy: Proxy{host='195.91.166.149', port=3128, username='null', password='null'}
6proxy: Proxy{host='123.139.56.238', port=9999, username='null', password='null'}
7proxy: Proxy{host='200.89.159.149', port=8000, username='null', password='null'}
8proxy: Proxy{host='124.172.232.49', port=8010, username='null', password='null'}
0key:Proxy{host='104.248.155.150', port=8080, username='null', password='null'}; value: true
1key:Proxy{host='59.127.168.43', port=3128, username='null', password='null'}; value: true
2key:Proxy{host='5.196.132.118', port=3128, username='null', password='null'}; value: true
3key:Proxy{host='121.33.220.158', port=808, username='null', password='null'}; value: true
4key:Proxy{host='118.26.170.209', port=8080, username='null', password='null'}; value: true
5key:Proxy{host='195.91.166.149', port=3128, username='null', password='null'}; value: true
6key:Proxy{host='200.89.159.149', port=8000, username='null', password='null'}; value: true
7key:Proxy{host='123.139.56.238', port=9999, username='null', password='null'}; value: true
8key:Proxy{host='124.172.232.49', port=8010, username='null', password='null'}; value: true
======================>35
org.apache.http.conn.ConnectTimeoutException: Connect to 120.198.76.45:41443 [/120.198.76.45] failed: connect timed out
	at org.apache.http.impl.conn.DefaultHttpClientConnectionOperator.connect(DefaultHttpClientConnectionOperator.java:150)
	at org.apache.http.impl.conn.PoolingHttpClientConnectionManager.connect(PoolingHttpClientConnectionManager.java:353)
	at org.apache.http.impl.execchain.MainClientExec.establishRoute(MainClientExec.java:388)
	at org.apache.http.impl.execchain.MainClientExec.execute(MainClientExec.java:236)
	at org.apache.http.impl.execchain.ProtocolExec.execute(ProtocolExec.java:184)
	at org.apache.http.impl.execchain.RetryExec.execute(RetryExec.java:88)
	at org.apache.http.impl.execchain.RedirectExec.execute(RedirectExec.java:110)
	at org.apache.http.impl.client.InternalHttpClient.doExecute(InternalHttpClient.java:184)
	at org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:82)
	at com.sndo.dmp.util.ProxyUtils.isValid(ProxyUtils.java:26)
	at com.sndo.dmp.ValidProxyProvider$ProxyManager.isValid(ValidProxyProvider.java:107)
	at com.sndo.dmp.ValidProxyProvider$ProxyManager.getValidProxy(ValidProxyProvider.java:87)
	at com.sndo.dmp.ValidProxyProvider$ProxyManager.run(ValidProxyProvider.java:74)
	at java.lang.Thread.run(Thread.java:745)
Caused by: java.net.SocketTimeoutException: connect timed out
	at java.net.DualStackPlainSocketImpl.waitForConnect(Native Method)
	at java.net.DualStackPlainSocketImpl.socketConnect(DualStackPlainSocketImpl.java:85)
	at java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:350)
	at java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:206)
	at java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:188)
	at java.net.PlainSocketImpl.connect(PlainSocketImpl.java:172)
	at java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392)
	at java.net.Socket.connect(Socket.java:589)
	at org.apache.http.conn.socket.PlainConnectionSocketFactory.connectSocket(PlainConnectionSocketFactory.java:74)
	at org.apache.http.impl.conn.DefaultHttpClientConnectionOperator.connect(DefaultHttpClientConnectionOperator.java:141)
	... 13 more
0proxy: Proxy{host='59.127.168.43', port=3128, username='null', password='null'}
1proxy: Proxy{host='121.33.220.158', port=808, username='null', password='null'}
2proxy: Proxy{host='104.248.155.150', port=8080, username='null', password='null'}
3proxy: Proxy{host='118.26.170.209', port=8080, username='null', password='null'}
4proxy: Proxy{host='195.91.166.149', port=3128, username='null', password='null'}
5proxy: Proxy{host='123.139.56.238', port=9999, username='null', password='null'}
6proxy: Proxy{host='200.89.159.149', port=8000, username='null', password='null'}
7proxy: Proxy{host='124.172.232.49', port=8010, username='null', password='null'}
8proxy: Proxy{host='5.196.132.118', port=3128, username='null', password='null'}
0key:Proxy{host='104.248.155.150', port=8080, username='null', password='null'}; value: true
1key:Proxy{host='59.127.168.43', port=3128, username='null', password='null'}; value: true
2key:Proxy{host='5.196.132.118', port=3128, username='null', password='null'}; value: true
3key:Proxy{host='121.33.220.158', port=808, username='null', password='null'}; value: true
4key:Proxy{host='118.26.170.209', port=8080, username='null', password='null'}; value: true
5key:Proxy{host='195.91.166.149', port=3128, username='null', password='null'}; value: true
6key:Proxy{host='200.89.159.149', port=8000, username='null', password='null'}; value: true
7key:Proxy{host='123.139.56.238', port=9999, username='null', password='null'}; value: true
8key:Proxy{host='124.172.232.49', port=8010, username='null', password='null'}; value: true
======================>36
0proxy: Proxy{host='121.33.220.158', port=808, username='null', password='null'}
1proxy: Proxy{host='104.248.155.150', port=8080, username='null', password='null'}
2proxy: Proxy{host='118.26.170.209', port=8080, username='null', password='null'}
3proxy: Proxy{host='195.91.166.149', port=3128, username='null', password='null'}
4proxy: Proxy{host='123.139.56.238', port=9999, username='null', password='null'}
5proxy: Proxy{host='200.89.159.149', port=8000, username='null', password='null'}
6proxy: Proxy{host='124.172.232.49', port=8010, username='null', password='null'}
7proxy: Proxy{host='5.196.132.118', port=3128, username='null', password='null'}
8proxy: Proxy{host='59.127.168.43', port=3128, username='null', password='null'}
0key:Proxy{host='104.248.155.150', port=8080, username='null', password='null'}; value: true
1key:Proxy{host='59.127.168.43', port=3128, username='null', password='null'}; value: true
2key:Proxy{host='5.196.132.118', port=3128, username='null', password='null'}; value: true
3key:Proxy{host='121.33.220.158', port=808, username='null', password='null'}; value: true
4key:Proxy{host='118.26.170.209', port=8080, username='null', password='null'}; value: true
5key:Proxy{host='195.91.166.149', port=3128, username='null', password='null'}; value: true
6key:Proxy{host='200.89.159.149', port=8000, username='null', password='null'}; value: true
7key:Proxy{host='123.139.56.238', port=9999, username='null', password='null'}; value: true
8key:Proxy{host='124.172.232.49', port=8010, username='null', password='null'}; value: true
======================>37
0proxy: Proxy{host='104.248.155.150', port=8080, username='null', password='null'}
1proxy: Proxy{host='118.26.170.209', port=8080, username='null', password='null'}
2proxy: Proxy{host='195.91.166.149', port=3128, username='null', password='null'}
3proxy: Proxy{host='123.139.56.238', port=9999, username='null', password='null'}
4proxy: Proxy{host='200.89.159.149', port=8000, username='null', password='null'}
5proxy: Proxy{host='124.172.232.49', port=8010, username='null', password='null'}
6proxy: Proxy{host='5.196.132.118', port=3128, username='null', password='null'}
7proxy: Proxy{host='59.127.168.43', port=3128, username='null', password='null'}
8proxy: Proxy{host='121.33.220.158', port=808, username='null', password='null'}
0key:Proxy{host='104.248.155.150', port=8080, username='null', password='null'}; value: true
1key:Proxy{host='59.127.168.43', port=3128, username='null', password='null'}; value: true
2key:Proxy{host='5.196.132.118', port=3128, username='null', password='null'}; value: true
3key:Proxy{host='121.33.220.158', port=808, username='null', password='null'}; value: true
4key:Proxy{host='118.26.170.209', port=8080, username='null', password='null'}; value: true
5key:Proxy{host='195.91.166.149', port=3128, username='null', password='null'}; value: true
6key:Proxy{host='200.89.159.149', port=8000, username='null', password='null'}; value: true
7key:Proxy{host='123.139.56.238', port=9999, username='null', password='null'}; value: true
8key:Proxy{host='124.172.232.49', port=8010, username='null', password='null'}; value: true
======================>38
0proxy: Proxy{host='118.26.170.209', port=8080, username='null', password='null'}
1proxy: Proxy{host='195.91.166.149', port=3128, username='null', password='null'}
2proxy: Proxy{host='123.139.56.238', port=9999, username='null', password='null'}
3proxy: Proxy{host='200.89.159.149', port=8000, username='null', password='null'}
4proxy: Proxy{host='124.172.232.49', port=8010, username='null', password='null'}
5proxy: Proxy{host='5.196.132.118', port=3128, username='null', password='null'}
6proxy: Proxy{host='59.127.168.43', port=3128, username='null', password='null'}
7proxy: Proxy{host='121.33.220.158', port=808, username='null', password='null'}
8proxy: Proxy{host='104.248.155.150', port=8080, username='null', password='null'}
0key:Proxy{host='104.248.155.150', port=8080, username='null', password='null'}; value: true
1key:Proxy{host='59.127.168.43', port=3128, username='null', password='null'}; value: true
2key:Proxy{host='5.196.132.118', port=3128, username='null', password='null'}; value: true
3key:Proxy{host='121.33.220.158', port=808, username='null', password='null'}; value: true
4key:Proxy{host='118.26.170.209', port=8080, username='null', password='null'}; value: true
5key:Proxy{host='195.91.166.149', port=3128, username='null', password='null'}; value: true
6key:Proxy{host='200.89.159.149', port=8000, username='null', password='null'}; value: true
7key:Proxy{host='123.139.56.238', port=9999, username='null', password='null'}; value: true
8key:Proxy{host='124.172.232.49', port=8010, username='null', password='null'}; value: true
======================>39
0proxy: Proxy{host='195.91.166.149', port=3128, username='null', password='null'}
1proxy: Proxy{host='123.139.56.238', port=9999, username='null', password='null'}
2proxy: Proxy{host='200.89.159.149', port=8000, username='null', password='null'}
3proxy: Proxy{host='124.172.232.49', port=8010, username='null', password='null'}
4proxy: Proxy{host='5.196.132.118', port=3128, username='null', password='null'}
5proxy: Proxy{host='59.127.168.43', port=3128, username='null', password='null'}
6proxy: Proxy{host='121.33.220.158', port=808, username='null', password='null'}
7proxy: Proxy{host='104.248.155.150', port=8080, username='null', password='null'}
0key:Proxy{host='104.248.155.150', port=8080, username='null', password='null'}; value: true
1key:Proxy{host='59.127.168.43', port=3128, username='null', password='null'}; value: true
2key:Proxy{host='5.196.132.118', port=3128, username='null', password='null'}; value: true
3key:Proxy{host='121.33.220.158', port=808, username='null', password='null'}; value: true
4key:Proxy{host='118.26.170.209', port=8080, username='null', password='null'}; value: false
5key:Proxy{host='195.91.166.149', port=3128, username='null', password='null'}; value: true
6key:Proxy{host='200.89.159.149', port=8000, username='null', password='null'}; value: true
7key:Proxy{host='123.139.56.238', port=9999, username='null', password='null'}; value: true
8key:Proxy{host='124.172.232.49', port=8010, username='null', password='null'}; value: true
======================>40
0proxy: Proxy{host='123.139.56.238', port=9999, username='null', password='null'}
1proxy: Proxy{host='200.89.159.149', port=8000, username='null', password='null'}
2proxy: Proxy{host='124.172.232.49', port=8010, username='null', password='null'}
3proxy: Proxy{host='5.196.132.118', port=3128, username='null', password='null'}
4proxy: Proxy{host='59.127.168.43', port=3128, username='null', password='null'}
5proxy: Proxy{host='121.33.220.158', port=808, username='null', password='null'}
6proxy: Proxy{host='104.248.155.150', port=8080, username='null', password='null'}
7proxy: Proxy{host='195.91.166.149', port=3128, username='null', password='null'}
0key:Proxy{host='104.248.155.150', port=8080, username='null', password='null'}; value: true
1key:Proxy{host='59.127.168.43', port=3128, username='null', password='null'}; value: true
2key:Proxy{host='5.196.132.118', port=3128, username='null', password='null'}; value: true
3key:Proxy{host='121.33.220.158', port=808, username='null', password='null'}; value: true
4key:Proxy{host='118.26.170.209', port=8080, username='null', password='null'}; value: false
5key:Proxy{host='195.91.166.149', port=3128, username='null', password='null'}; value: true
6key:Proxy{host='200.89.159.149', port=8000, username='null', password='null'}; value: true
7key:Proxy{host='123.139.56.238', port=9999, username='null', password='null'}; value: true
8key:Proxy{host='124.172.232.49', port=8010, username='null', password='null'}; value: true
======================>41
0proxy: Proxy{host='200.89.159.149', port=8000, username='null', password='null'}
1proxy: Proxy{host='124.172.232.49', port=8010, username='null', password='null'}
2proxy: Proxy{host='5.196.132.118', port=3128, username='null', password='null'}
3proxy: Proxy{host='59.127.168.43', port=3128, username='null', password='null'}
4proxy: Proxy{host='121.33.220.158', port=808, username='null', password='null'}
5proxy: Proxy{host='104.248.155.150', port=8080, username='null', password='null'}
6proxy: Proxy{host='195.91.166.149', port=3128, username='null', password='null'}
7proxy: Proxy{host='123.139.56.238', port=9999, username='null', password='null'}
0key:Proxy{host='104.248.155.150', port=8080, username='null', password='null'}; value: true
1key:Proxy{host='59.127.168.43', port=3128, username='null', password='null'}; value: true
2key:Proxy{host='5.196.132.118', port=3128, username='null', password='null'}; value: true
3key:Proxy{host='121.33.220.158', port=808, username='null', password='null'}; value: true
4key:Proxy{host='118.26.170.209', port=8080, username='null', password='null'}; value: false
5key:Proxy{host='195.91.166.149', port=3128, username='null', password='null'}; value: true
6key:Proxy{host='200.89.159.149', port=8000, username='null', password='null'}; value: true
7key:Proxy{host='123.139.56.238', port=9999, username='null', password='null'}; value: true
8key:Proxy{host='124.172.232.49', port=8010, username='null', password='null'}; value: true
======================>42
0proxy: Proxy{host='124.172.232.49', port=8010, username='null', password='null'}
1proxy: Proxy{host='5.196.132.118', port=3128, username='null', password='null'}
2proxy: Proxy{host='59.127.168.43', port=3128, username='null', password='null'}
3proxy: Proxy{host='121.33.220.158', port=808, username='null', password='null'}
4proxy: Proxy{host='104.248.155.150', port=8080, username='null', password='null'}
5proxy: Proxy{host='195.91.166.149', port=3128, username='null', password='null'}
6proxy: Proxy{host='123.139.56.238', port=9999, username='null', password='null'}
7proxy: Proxy{host='167.71.106.246', port=3128, username='null', password='null'}
8proxy: Proxy{host='200.89.159.149', port=8000, username='null', password='null'}
0key:Proxy{host='104.248.155.150', port=8080, username='null', password='null'}; value: true
1key:Proxy{host='59.127.168.43', port=3128, username='null', password='null'}; value: true
2key:Proxy{host='5.196.132.118', port=3128, username='null', password='null'}; value: true
3key:Proxy{host='121.33.220.158', port=808, username='null', password='null'}; value: true
4key:Proxy{host='195.91.166.149', port=3128, username='null', password='null'}; value: true
5key:Proxy{host='200.89.159.149', port=8000, username='null', password='null'}; value: true
6key:Proxy{host='123.139.56.238', port=9999, username='null', password='null'}; value: true
7key:Proxy{host='124.172.232.49', port=8010, username='null', password='null'}; value: true
8key:Proxy{host='167.71.106.246', port=3128, username='null', password='null'}; value: true
======================>43
0proxy: Proxy{host='5.196.132.118', port=3128, username='null', password='null'}
1proxy: Proxy{host='59.127.168.43', port=3128, username='null', password='null'}
2proxy: Proxy{host='121.33.220.158', port=808, username='null', password='null'}
3proxy: Proxy{host='104.248.155.150', port=8080, username='null', password='null'}
4proxy: Proxy{host='195.91.166.149', port=3128, username='null', password='null'}
5proxy: Proxy{host='123.139.56.238', port=9999, username='null', password='null'}
6proxy: Proxy{host='167.71.106.246', port=3128, username='null', password='null'}
7proxy: Proxy{host='200.89.159.149', port=8000, username='null', password='null'}
8proxy: Proxy{host='124.172.232.49', port=8010, username='null', password='null'}
0key:Proxy{host='104.248.155.150', port=8080, username='null', password='null'}; value: true
1key:Proxy{host='59.127.168.43', port=3128, username='null', password='null'}; value: true
2key:Proxy{host='5.196.132.118', port=3128, username='null', password='null'}; value: true
3key:Proxy{host='121.33.220.158', port=808, username='null', password='null'}; value: true
4key:Proxy{host='195.91.166.149', port=3128, username='null', password='null'}; value: true
5key:Proxy{host='200.89.159.149', port=8000, username='null', password='null'}; value: true
6key:Proxy{host='123.139.56.238', port=9999, username='null', password='null'}; value: true
7key:Proxy{host='124.172.232.49', port=8010, username='null', password='null'}; value: true
8key:Proxy{host='167.71.106.246', port=3128, username='null', password='null'}; value: true
======================>44
0proxy: Proxy{host='59.127.168.43', port=3128, username='null', password='null'}
1proxy: Proxy{host='121.33.220.158', port=808, username='null', password='null'}
2proxy: Proxy{host='104.248.155.150', port=8080, username='null', password='null'}
3proxy: Proxy{host='195.91.166.149', port=3128, username='null', password='null'}
4proxy: Proxy{host='123.139.56.238', port=9999, username='null', password='null'}
5proxy: Proxy{host='167.71.106.246', port=3128, username='null', password='null'}
6proxy: Proxy{host='200.89.159.149', port=8000, username='null', password='null'}
7proxy: Proxy{host='124.172.232.49', port=8010, username='null', password='null'}
8proxy: Proxy{host='5.196.132.118', port=3128, username='null', password='null'}
0key:Proxy{host='104.248.155.150', port=8080, username='null', password='null'}; value: true
1key:Proxy{host='59.127.168.43', port=3128, username='null', password='null'}; value: true
2key:Proxy{host='5.196.132.118', port=3128, username='null', password='null'}; value: true
3key:Proxy{host='121.33.220.158', port=808, username='null', password='null'}; value: true
4key:Proxy{host='195.91.166.149', port=3128, username='null', password='null'}; value: true
5key:Proxy{host='200.89.159.149', port=8000, username='null', password='null'}; value: true
6key:Proxy{host='123.139.56.238', port=9999, username='null', password='null'}; value: true
7key:Proxy{host='124.172.232.49', port=8010, username='null', password='null'}; value: true
8key:Proxy{host='167.71.106.246', port=3128, username='null', password='null'}; value: true
======================>45
0proxy: Proxy{host='121.33.220.158', port=808, username='null', password='null'}
1proxy: Proxy{host='104.248.155.150', port=8080, username='null', password='null'}
2proxy: Proxy{host='195.91.166.149', port=3128, username='null', password='null'}
3proxy: Proxy{host='123.139.56.238', port=9999, username='null', password='null'}
4proxy: Proxy{host='167.71.106.246', port=3128, username='null', password='null'}
5proxy: Proxy{host='200.89.159.149', port=8000, username='null', password='null'}
6proxy: Proxy{host='124.172.232.49', port=8010, username='null', password='null'}
7proxy: Proxy{host='5.196.132.118', port=3128, username='null', password='null'}
8proxy: Proxy{host='59.127.168.43', port=3128, username='null', password='null'}
0key:Proxy{host='104.248.155.150', port=8080, username='null', password='null'}; value: true
1key:Proxy{host='59.127.168.43', port=3128, username='null', password='null'}; value: true
2key:Proxy{host='5.196.132.118', port=3128, username='null', password='null'}; value: true
3key:Proxy{host='121.33.220.158', port=808, username='null', password='null'}; value: true
4key:Proxy{host='195.91.166.149', port=3128, username='null', password='null'}; value: true
5key:Proxy{host='200.89.159.149', port=8000, username='null', password='null'}; value: true
6key:Proxy{host='123.139.56.238', port=9999, username='null', password='null'}; value: true
7key:Proxy{host='124.172.232.49', port=8010, username='null', password='null'}; value: true
8key:Proxy{host='167.71.106.246', port=3128, username='null', password='null'}; value: true
======================>46
0proxy: Proxy{host='104.248.155.150', port=8080, username='null', password='null'}
1proxy: Proxy{host='195.91.166.149', port=3128, username='null', password='null'}
2proxy: Proxy{host='123.139.56.238', port=9999, username='null', password='null'}
3proxy: Proxy{host='167.71.106.246', port=3128, username='null', password='null'}
4proxy: Proxy{host='200.89.159.149', port=8000, username='null', password='null'}
5proxy: Proxy{host='124.172.232.49', port=8010, username='null', password='null'}
6proxy: Proxy{host='5.196.132.118', port=3128, username='null', password='null'}
7proxy: Proxy{host='59.127.168.43', port=3128, username='null', password='null'}
8proxy: Proxy{host='121.33.220.158', port=808, username='null', password='null'}
0key:Proxy{host='104.248.155.150', port=8080, username='null', password='null'}; value: true
1key:Proxy{host='59.127.168.43', port=3128, username='null', password='null'}; value: true
2key:Proxy{host='5.196.132.118', port=3128, username='null', password='null'}; value: true
3key:Proxy{host='121.33.220.158', port=808, username='null', password='null'}; value: true
4key:Proxy{host='195.91.166.149', port=3128, username='null', password='null'}; value: true
5key:Proxy{host='200.89.159.149', port=8000, username='null', password='null'}; value: true
6key:Proxy{host='123.139.56.238', port=9999, username='null', password='null'}; value: true
7key:Proxy{host='124.172.232.49', port=8010, username='null', password='null'}; value: true
8key:Proxy{host='167.71.106.246', port=3128, username='null', password='null'}; value: true
======================>47
org.apache.http.conn.ConnectTimeoutException: Connect to 167.71.103.168:3128 [/167.71.103.168] failed: connect timed out
	at org.apache.http.impl.conn.DefaultHttpClientConnectionOperator.connect(DefaultHttpClientConnectionOperator.java:150)
	at org.apache.http.impl.conn.PoolingHttpClientConnectionManager.connect(PoolingHttpClientConnectionManager.java:353)
	at org.apache.http.impl.execchain.MainClientExec.establishRoute(MainClientExec.java:388)
	at org.apache.http.impl.execchain.MainClientExec.execute(MainClientExec.java:236)
	at org.apache.http.impl.execchain.ProtocolExec.execute(ProtocolExec.java:184)
	at org.apache.http.impl.execchain.RetryExec.execute(RetryExec.java:88)
	at org.apache.http.impl.execchain.RedirectExec.execute(RedirectExec.java:110)
	at org.apache.http.impl.client.InternalHttpClient.doExecute(InternalHttpClient.java:184)
	at org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:82)
	at com.sndo.dmp.util.ProxyUtils.isValid(ProxyUtils.java:26)
	at com.sndo.dmp.ValidProxyProvider$ProxyManager.isValid(ValidProxyProvider.java:107)
	at com.sndo.dmp.ValidProxyProvider$ProxyManager.getValidProxy(ValidProxyProvider.java:87)
	at com.sndo.dmp.ValidProxyProvider$ProxyManager.run(ValidProxyProvider.java:74)
	at java.lang.Thread.run(Thread.java:745)
Caused by: java.net.SocketTimeoutException: connect timed out
	at java.net.DualStackPlainSocketImpl.waitForConnect(Native Method)
	at java.net.DualStackPlainSocketImpl.socketConnect(DualStackPlainSocketImpl.java:85)
	at java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:350)
	at java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:206)
	at java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:188)
	at java.net.PlainSocketImpl.connect(PlainSocketImpl.java:172)
	at java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392)
	at java.net.Socket.connect(Socket.java:589)
	at org.apache.http.conn.socket.PlainConnectionSocketFactory.connectSocket(PlainConnectionSocketFactory.java:74)
	at org.apache.http.impl.conn.DefaultHttpClientConnectionOperator.connect(DefaultHttpClientConnectionOperator.java:141)
	... 13 more
0proxy: Proxy{host='195.91.166.149', port=3128, username='null', password='null'}
1proxy: Proxy{host='123.139.56.238', port=9999, username='null', password='null'}
2proxy: Proxy{host='167.71.106.246', port=3128, username='null', password='null'}
3proxy: Proxy{host='200.89.159.149', port=8000, username='null', password='null'}
4proxy: Proxy{host='124.172.232.49', port=8010, username='null', password='null'}
5proxy: Proxy{host='5.196.132.118', port=3128, username='null', password='null'}
6proxy: Proxy{host='59.127.168.43', port=3128, username='null', password='null'}
7proxy: Proxy{host='121.33.220.158', port=808, username='null', password='null'}
8proxy: Proxy{host='104.248.155.150', port=8080, username='null', password='null'}
0key:Proxy{host='104.248.155.150', port=8080, username='null', password='null'}; value: true
1key:Proxy{host='59.127.168.43', port=3128, username='null', password='null'}; value: true
2key:Proxy{host='5.196.132.118', port=3128, username='null', password='null'}; value: true
3key:Proxy{host='121.33.220.158', port=808, username='null', password='null'}; value: true
4key:Proxy{host='195.91.166.149', port=3128, username='null', password='null'}; value: true
5key:Proxy{host='200.89.159.149', port=8000, username='null', password='null'}; value: true
6key:Proxy{host='123.139.56.238', port=9999, username='null', password='null'}; value: true
7key:Proxy{host='124.172.232.49', port=8010, username='null', password='null'}; value: true
8key:Proxy{host='167.71.106.246', port=3128, username='null', password='null'}; value: true
======================>48
0proxy: Proxy{host='123.139.56.238', port=9999, username='null', password='null'}
1proxy: Proxy{host='167.71.106.246', port=3128, username='null', password='null'}
2proxy: Proxy{host='200.89.159.149', port=8000, username='null', password='null'}
3proxy: Proxy{host='124.172.232.49', port=8010, username='null', password='null'}
4proxy: Proxy{host='5.196.132.118', port=3128, username='null', password='null'}
5proxy: Proxy{host='59.127.168.43', port=3128, username='null', password='null'}
6proxy: Proxy{host='121.33.220.158', port=808, username='null', password='null'}
7proxy: Proxy{host='104.248.155.150', port=8080, username='null', password='null'}
8proxy: Proxy{host='195.91.166.149', port=3128, username='null', password='null'}
0key:Proxy{host='104.248.155.150', port=8080, username='null', password='null'}; value: true
1key:Proxy{host='59.127.168.43', port=3128, username='null', password='null'}; value: true
2key:Proxy{host='5.196.132.118', port=3128, username='null', password='null'}; value: true
3key:Proxy{host='121.33.220.158', port=808, username='null', password='null'}; value: true
4key:Proxy{host='195.91.166.149', port=3128, username='null', password='null'}; value: true
5key:Proxy{host='200.89.159.149', port=8000, username='null', password='null'}; value: true
6key:Proxy{host='123.139.56.238', port=9999, username='null', password='null'}; value: true
7key:Proxy{host='124.172.232.49', port=8010, username='null', password='null'}; value: true
8key:Proxy{host='167.71.106.246', port=3128, username='null', password='null'}; value: true
======================>49



Process finished with exit code 0
