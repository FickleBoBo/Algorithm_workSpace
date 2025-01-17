package day_12.BOJ_S3_15652;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static int N;
    static int M;
    static int[] sel;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        sel = new int[M];

        combination(1, 0);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static void combination(int idx, int sidx){
        if(sidx == M){
            for(int n : sel){
                sb.append(n).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i=idx ; i<=N ; i++){
            sel[sidx] = i;
            combination(i, sidx+1);
        }
    }

}
