package com.wipro;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Player player[] = new Player[5];

		for (int i = 0; i < player.length; i++) {
			player[i] = new Player();
		}

		ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
		player[0] = (Player) context.getBean("Player1");
		player[1] = (Player) context.getBean("Player2");
		player[2] = (Player) context.getBean("Player3");
		player[3] = (Player) context.getBean("Player4");
		player[4] = (Player) context.getBean("Player5");

		for (int i = 0; i < player.length; i++) {
			System.out.println(player[i]);
		}

		System.out.println("Do you wish to search players(y/n)");
		char ch = sc.next().charAt(0);
		if (ch == 'y' || ch == 'Y') {
			System.out.println("Enter Country Name to search players");
			String str = sc.next();

			System.out.println("Player who belong to country " + str + " are:");
			for (int i = 0, k = 1; i < 5; i++) {
				if (str.equalsIgnoreCase(player[i].getCountry().getCountryName())) {
					System.out.println(k + "." + player[i].getPlayerName());
					k++;
				} else {
					System.out.println("Wrong Input");
				}
			}
		} else {
			System.exit(0);
		}
	}

}
