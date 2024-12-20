package com.thanos.web3j.channel.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

public class Encoder extends MessageToByteEncoder<Message> {
	private static Logger logger = LoggerFactory.getLogger(Encoder.class);
	
	@Override
	protected void encode(ChannelHandlerContext ctx, Message msg, ByteBuf out) throws Exception {
		logger.debug("encode:" + msg.getLength() + "," + msg.getData());
		
		out.writeIntLE(msg.getLength());
		out.writeShortLE(msg.getType());
		out.writeBytes(msg.getData());
	}
}
