package util;

/**
 * 获取组件路径
 * 
 * @author move
 * 
 */
public class OSInfo {
	private static String OS_NAME = System.getProperty("os.name").toLowerCase();
	private static String OS_ARCH = System.getProperty("os.arch").toLowerCase();

	/**
	 * 根据操作系统获得对应的组件路�?
	 * 
	 * @param module
	 *            组件�?不带扩展�?
	 * @return 形式如下：linux64/组件�?扩展名�?win32/组件�?扩展�?
	 */
	public static String getModulePath(String module) {
		String folder = ""; // 文件夹名
		String extension = ""; // 扩展�?

		if (OS_NAME.contains("win")) {
			extension = ".dll";

			if (OS_ARCH.contains("86")) {
				folder = "win32/";
			} else {
				folder = "win64/";
			}
		} else {
			extension = ".so";

			if (OS_ARCH.contains("86")) {
				folder = "linux32/";
			} else {
				folder = "linux64/";
			}
		}

		return folder + module + extension;
	}
}
