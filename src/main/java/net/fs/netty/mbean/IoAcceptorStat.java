package  net.fs.netty.mbean;

import  net.fs.netty.SocksServer;

public class IoAcceptorStat implements IoAcceptorStatMBean {

	@Override
	public long getWrittenBytesThroughput() {
		return SocksServer.getInstance().getTrafficCounter()
				.lastWriteThroughput();
	}

	@Override
	public long getReadBytesThroughput() {
		return SocksServer.getInstance().getTrafficCounter()
				.lastReadThroughput();
	}

}
