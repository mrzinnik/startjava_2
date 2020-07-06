public class Variable {
	public static void main(String[] args) {
		byte cpuCoreNumb = 4;
		short cpuThreadNumb = 4;
		int cpuCoreBaseMhz = 3400;
		long cpuCoreMaxMhz = 3800l;
		float cpuRamMinGhz = 0.8f;
		double cpuRamMaxGhz = 2.4d;
		char cpuCacheMemory = '6';
		boolean isIntegratedGpuExist = true;
		
		System.out.println("cpuCoreNumb = " + cpuCoreNumb);
		System.out.println("cpuThreadNumb = " + cpuThreadNumb);
		System.out.println("cpuCoreBaseMhz = " + cpuCoreBaseMhz + " MGhz");
		System.out.println("cpuCoreMaxMhz = " + cpuCoreMaxMhz + " MGhz");
		System.out.println("cpuRamMinGhz = " + cpuRamMinGhz + " MGhz");
		System.out.println("cpuRamMaxGhz = " + cpuRamMaxGhz + " MGhz");
		System.out.println("cpuCacheMemory = " + cpuCacheMemory + " MB");
		System.out.println("isIntegratedGpuExist = " + isIntegratedGpuExist);
	}
}