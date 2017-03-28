package  net.fs.netty;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * socksserver启动类
 * 
 * @author zhangjianxin
 * 
 */
public class Start {

	public static void main(String[] args) {
		SocksServer.getInstance().start();
		try {
		}catch (Exception e){
			e.printStackTrace();
		}

	}
}
