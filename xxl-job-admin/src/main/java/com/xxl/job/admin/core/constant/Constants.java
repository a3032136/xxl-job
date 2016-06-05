package com.xxl.job.admin.core.constant;

/**
 * job group
 * @author xuxueli 2016-1-15 14:23:05
 */
public class Constants {
	
	public enum JobGroupEnum{
		DEFAULT("默认"),
		XTJC("系统基础"),
		YWJC("业务基础"),
		DFRW("垫付任务"),
		HBRW("红包任务"),
		ZKRW("直客任务"),
		LHQRW("零花钱任务");
		private String desc;
		private JobGroupEnum(String desc){
			this.desc = desc;
		}
		public String getDesc() {
			return desc;
		}
		public static JobGroupEnum match(String name){
			if (name==null || name.trim().length()==0) {
				return null;
			}
			for (JobGroupEnum group : JobGroupEnum.values()) {
				if (group.name().equals(name)) {
					return group;
				}
			}
			return null;
		}
	}
}
