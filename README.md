# FinalSpeed
FinalSpeed是高速双边加速软件,可加速所有基于tcp协议的网络服务,在高丢包和高延迟环境下,仍可达到90%的物理带宽利用率,即使高峰时段也能轻松跑满带宽.

### 安装教程
[客户端安装说明](https://udpspeed.com/installclient)
<br />
[服务端安装说明](https://udpspeed.com/installserver)

### 说明


Finalspeed作者开始卖收费版了，所以停止了免费版的更新，并且删除了所有代码。不过还好我fork了一份。。作为Openvz的救星，还是有不少人对finalspeed有需求的。


github地址：https://github.com/zmatsh/NSS



### NSS操作命令

编译： mvn clean package

运行: java -jar NSS.jar 

### socket5

tcpspeed 已经整合了socket5 ，finalspeed 没有整合 这边进行了整合。

NSS socket通讯部分采用 OSGI的方式集成的，配置信息在conf/config.xml内

socket 5 通讯端口 兼容 ss服务端。


### 友情提示：
    在实际情况影响下，tcpspeed 与 NSS 速度一致。
    搬瓦工服务器512M服务器能跑满北京联通100M宽带
    
### 快速启动：
```text
docker run -d --restart=always -e 'SS_PASSWORD=1111111111111111' -p 8338:8338/tcp -p 150:150/udp -p 150:150/tcp --name=my-fs-ss firshme/nssserver:latest
```
### ub2系统支持的docker比较好

#欢迎fork star

## 端口已经默认配置好了 只需要修改密码即可 socket Port 1081

##当前已经制作好可运行的包了。 
* 只需要自己安装一个 docker 就可以启动一切。
* 步骤：
```text
1, docker run -d --restart=always -e 'SS_PASSWORD=1111111111111111' -p 8338:8338/tcp -p 150:150/udp -p 150:150/tcp --name=my-fs-ss firshme/nssserver:latest

2, 下载这个项目，修改conf目录内的配置。

3, java -jar NSS-1.0-SNAPSHOT-jar-with-dependencies.jar

```
##详细配置


```xml
<?xml version="1.0" encoding="UTF-8" ?>
<config>
	<ip_addr>127.0.0.1</ip_addr>
	<port>1085</port> 
	<local_ip_addr>127.0.0.1</local_ip_addr>
	<local_port>1081</local_port>
	<method>aes-256-cfb</method>
	<password>1111111111111</password>
</config>

```


```json
{
// 服务器地址
  "recent_address_list": [
    "172.2.2.2",
    "172.2.2.1",
    "172.2.2.3",
    "12.22.31.56"
  ],
  "upload_speed": 834094,
  "download_speed": 2263970,
  "server_port": 150,
  "server_address": "12.22.31.56",
  "protocal": "udp",
  "socks5_port": 1085,
  "auto_start": false
}
```

<<<<<<< HEAD
# port_map.json

```json
   
{"map_list":[{"listen_port":1085,"name":"fuckGFW","dst_port":8338}]}

```
=======
### FMTNSS 更新版本
>>>>>>> 082e55bbb9ce48781bb89313b79755b548a522c4

https://github.com/breakEval13/RMTNSS
 


