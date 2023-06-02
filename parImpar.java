package uf2;

public class parImpar {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("S'esperen 3 paràmetres separats per comes");
			return;
		}

		int num1, num2, num3;
		try {
			String[] nums = args[0].split(",");
			num1 = Integer.parseInt(nums[0].trim());
			num2 = Integer.parseInt(nums[1].trim());
			num3 = Integer.parseInt(nums[2].trim());
		} catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Error en els paràmetres d'entrada");
			return;
		}

		int suma = num1 + num2 + num3;
		String parImpar;
		if (suma % 2 == 0) {
			parImpar = "parell";
		} else {
			parImpar = "imparell";
		}
		System.out.println("Sortida: " + suma + " és " + parImpar);
	}
}
