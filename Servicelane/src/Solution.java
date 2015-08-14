import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		
		System.out.println("The Program Starts from here....!!");
		Scanner in = new Scanner(System.in);
		int i, j, k, t, n = 0;
		n = in.nextInt();
		if (n < 2 || n > 100000)
			try {
				throw new Exception("n is out of range");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		else {
			t = in.nextInt();
			if (t < 1 || t > 1000) {
				try {
					throw new Exception("t is out of range");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				int[] width = new int[n];
				for (k = 0; k < n; k++) {
					width[k] = in.nextInt();
					if (width[k] > 3 || width[k] < 1) {
						try {
							throw new Exception("width is out of range");
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}

				}

				int max = 3;
				int[] output = new int[t];

				for (k = 0; k < t; k++) {
					i = in.nextInt();
					j = in.nextInt();
					if (i < 0 || i > j || j >= n||(j-i+1)<2||(j-i+1)>Math.min(n, 1000)) {
						try {
							throw new Exception("i or j invalid");
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					} else {
						max = 3;
						while (i <= j) {
							if (width[i] > 3 || width[i] < 1) {
								try {
									System.out.println("tadapapapaa");
									throw new Exception("width is out of range");
								} catch (Exception e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							} else {
								max = Math.min(width[i], max);
								i++;
							}
						}
						output[k] = max;
					}

				}
				for (k = 0; k < t; k++) {
					System.out.println(output[k]);
				}
			}
		}

	}
}
