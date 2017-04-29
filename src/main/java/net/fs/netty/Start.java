package  net.fs.netty;


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
