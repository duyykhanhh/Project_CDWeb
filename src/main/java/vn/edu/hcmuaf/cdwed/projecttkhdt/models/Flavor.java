package vn.edu.hcmuaf.cdwed.projecttkhdt.models;

public class Flavor {
	private static double chocolatePrice = 5000;
	private static double mathcaPrice = 5000;
	private static double taroPrice = 5000;

public static String getFlavorDescription(Object o) {
	if(o instanceof ChocolateFlavor) {
		return "Chocolate";
	}
	else if(o instanceof MatchaFlavor) {
		return "Matcha";
	}
	else if(o instanceof TaroFlavor) {
		return "Taro";
	}
	return "";
}
public static double getPrice(Object o) {
	if(o instanceof ChocolateFlavor) {
		return chocolatePrice;
	}
	else if(o instanceof MatchaFlavor) {
		return mathcaPrice;
	}
	else if(o instanceof TaroFlavor) {
		return taroPrice;
	}
	return 0;
}

public static void setChocolatePrice(double chocolatePrice) {
	Flavor.chocolatePrice = chocolatePrice;
}

public static void setMathcaPrice(double mathcaPrice) {
	Flavor.mathcaPrice = mathcaPrice;
}

public static void setTaroPrice(double taroPrice) {
	Flavor.taroPrice = taroPrice;
}
}
