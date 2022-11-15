package com;

import java.util.Scanner;

public class AllMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Scanner = new Scanner(System.in);
		System.out.println("The enter name");

		String TAMIL = Scanner.nextLine();
		System.out.println("Enter the name:" + TAMIL.compareTo(TAMIL));
		System.out.println("Name or enter:" + TAMIL.compareToIgnoreCase(TAMIL));
		System.out.println("nubmer to enter:" + TAMIL.compareToIgnoreCase(TAMIL));
		System.out.println("Compare the index:" + TAMIL.concat(TAMIL));
		System.out.println("The nubmer:" + TAMIL.contains(TAMIL));
		System.out.println("Last nubmer:" + TAMIL.contentEquals(TAMIL));

		System.out.println("The  name");
		String Desa = Scanner.next();
		System.out.println("The Meth enter:" + TAMIL.endsWith(Desa));
		System.out.println("Equals: " + TAMIL.equals(Desa));
		System.out.println("Empty: " + TAMIL.isEmpty());
		System.out.println("Ends with '.com': " + TAMIL.endsWith(Desa));
		System.out.println("And for:" + TAMIL.format(Desa, Desa));
		System.out.println("Run the man:" + TAMIL.intern());
		System.out.println("The holle:" + TAMIL.isEmpty());
		System.out.println("For line:" + TAMIL.matches(Desa));
		System.out.println("Stirng line:" + TAMIL.replace(Desa, Desa));
		System.out.println("Was con:" + TAMIL.replaceFirst(Desa, Desa));
		System.out.println("you for :" + TAMIL.replaceAll(Desa, Desa));
		System.out.println("Don of name :" + TAMIL.split(Desa));
		System.out.println("Name you:" + TAMIL.startsWith(Desa));
		System.out.println("Com.name:" + TAMIL.toLowerCase());
		System.out.println("Copy the:" + TAMIL.toString());
		System.out.println("Time name:" + TAMIL.toUpperCase());
		System.out.println("All time:" + TAMIL.trim());
		System.out.println("Line You:" + TAMIL.valueOf(Desa));

		System.out.println("The school name");

		String str = Scanner.nextLine();
		System.out.println("Char at index 3: " + TAMIL.charAt(1));

		{
			System.out.println("The Name Tamil ");
			String s1 = Scanner.next();
			byte[] barr = s1.getBytes();
			for (int i = 0; i < barr.length; i++) {
				System.out.println(barr[i]);
			}

			Scanner Sc = new Scanner(System.in);

			int sand = Sc.nextInt();
			int end = Sc.nextInt();
			System.out.println("Not name:" + TAMIL.substring(0));
			System.out.println("Int at Meth:" + TAMIL.codePointAt(0));
			System.out.println("Int and index:" + TAMIL.codePointBefore(1));
			;
			System.out.println("the Enter:" + TAMIL.codePointCount(sand, end));
			System.out.println("Man ger:" + TAMIL.offsetByCodePoints(2, 3));
			System.out.println("sub sequuenc :" + TAMIL.subSequence(sand, end));

			{
				String st = new String("hello javatpoint");
				char[] ch = new char[10];
				try {
					st.getChars(6, 16, ch, 0);
					System.out.println(ch);
				} catch (Exception ex) {
					System.out.println(ex);
				}

				System.out.println("The man  name");
				int Math = Scanner.nextInt();
				System.out.println("Length of Math: " + TAMIL.length());
				System.out.println("Upper case: " + TAMIL.toUpperCase());
				System.out.println("king Stirng:" + TAMIL.hashCode());
				System.out.println("Length int:" + TAMIL.indexOf(Math));
				System.out.println("Last index of 'a':" + TAMIL.lastIndexOf(Math));

				{

					char[] cn = TAMIL.toCharArray();
					for (int n = 0; n < cn.length; n++) {
						System.out.println(cn[n]);
					}

					System.out.println("The FOR UO");

					String tamil = Sc.next();
					System.out.println("In you:" + TAMIL.regionMatches(Math, TAMIL, Math, sand));

				}
			}

		}

	}
}