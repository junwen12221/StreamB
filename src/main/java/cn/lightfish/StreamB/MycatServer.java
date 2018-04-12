/*
 * Copyright (c) 2013, OpenCloudDB/MyCAT and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software;Designed and Developed mainly by many Chinese 
 * opensource volunteers. you can redistribute it and/or modify it under the 
 * terms of the GNU General Public License version 2 only, as published by the
 * Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 * 
 * Any questions about this component can be directed to it's project Web address 
 * https://code.google.com/p/opencloudb/.
 *
 */
package cn.lightfish.StreamB;

import cn.lightfish.StreamB.memory.MyCatMemory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;


/**
 * @author mycat
 */
public class MycatServer {
	

	/**
	 * Mycat 内存管理类
	 */
	private MyCatMemory myCatMemory = null;
	private static final Logger LOGGER = LoggerFactory.getLogger("MycatServer");
	public static final MycatServer getInstance() {
		return INSTANCE;
	}
	private static final MycatServer INSTANCE = new MycatServer();
	private MycatServer() {
	}

	public MyCatMemory getMyCatMemory() {
		return myCatMemory;
	}
	private static final int DEFAULT_BUFFER_POOL_PAGE_SIZE = 512*1024*4;
	public void startup() throws IOException {
		SystemConfig system = new SystemConfig();
			/**
		 * Off Heap For Merge/Order/Group/Limit 初始化
		 */
		if(true){
			try {
				myCatMemory = new MyCatMemory(system,DEFAULT_BUFFER_POOL_PAGE_SIZE);
			} catch (NoSuchFieldException e) {
				LOGGER .error("NoSuchFieldException",e);
			} catch (IllegalAccessException e) {
				LOGGER.error("Error",e);
			}
		}
	}

}
