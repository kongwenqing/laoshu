package com.jd.mao;
/*
 * ð�������ѡ������ð������������������ѡ������ͨ���±�ı�
 */
public class SortMao {
	public static void main(String[] args) {
		
			Integer[] teger = {24,35,35,46,23,46,466,-3,54,45};
			for (int i = 0; i < teger.length-1; i++) {
				for (int j = 0; j < teger.length-i-1; j++) {
					if (teger[j].compareTo(teger[j+1])<0) {
						int temp = 0;
						temp = teger[j+1];
						teger[j+1] =teger[j];
						teger[j] = temp;
					}
				}
			}
		
			for (Integer inte : teger) {
				System.out.println("������---"+inte+"   ");
			}
	}
}
