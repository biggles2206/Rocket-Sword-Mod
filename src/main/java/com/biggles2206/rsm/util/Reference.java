package com.biggles2206.rsm.util;

public class Reference {
	public static enum modItems {
		WOODROCKETSWORD("WoodRocketSword", "woodRocketSword");
		
		private String unlocalizedName;
		private String registryName;
		
		modItems(String unlocalisedName, String RegistryName){
			this.unlocalizedName = unlocalisedName;
			this.registryName = RegistryName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
	}
}