/**
 * Created by Rahul Thapar on 03-09-2016.
 */

import java.io.*;
import java.util.*;
public class Fireblaze {
    public static void main(String[] args) throws IOException
    {
        in.init(System.in);
        int n = in.nextInt();
        e = new int[n];
        for(int i = 0; i < n; i ++)
            e[i] = in.nextInt();
        DisjointSet set = new DisjointSet(n);
        int m = in.nextInt();
        for(int i = 0; i < m; i ++)
            set.union(in.nextInt()-1, in.nextInt()-1);
        long ans = 1;
        long mod = 1000000007;
        for(int i = 0; i < n; i ++)
            if(set.base[i]<0)
                ans=(ans*set.count[i])%mod;
        System.out.println(ans);
    }
    static int[] e;
    static class DisjointSet
    {
        int[] base;
        int size;
        int[] min;
        int[] count;
        DisjointSet(int n)
        {
            size = n;
            base = new int[n];
            min = new int[n];
            count = new int[n];
            Arrays.fill(base, -1);
            Arrays.fill(count, 1);
            for(int i = 0; i < n; i ++)
                min[i]=e[i];
        }
        void union(int a, int b)
        {
            int p1 = find(a);
            int p2 = find(b);
            if(p1==p2) return;
            size--;
            if(min[p1]>min[p2])
            {
                min[p1]=min[p2];
                count[p1]=count[p2];
            }
            else if(min[p1]<min[p2])
            {
                min[p2]=min[p1];
                count[p2]=count[p1];
            }
            else
            {
                count[p1]+=count[p2];
                count[p2]=count[p1];
            }

            if(getSize(p1)>getSize(p2))
            {
                base[p1]+=base[p2];
                base[p2]=p1;
            }
            else
            {
                base[p2]+=base[p1];
                base[p1]=p2;
            }
        }
        int find(int a)
        {
            if(base[a]<0) return a;
            int id = find(base[a]);
            base[a]=id;
            return id;
        }
        int getSize(int a)
        {
            if(base[a]<0) return -base[a];
            int b = find(a);
            return base[b];
        }
    }
    public static class in {
        static BufferedReader reader;
        static StringTokenizer tokenizer;
        static void init(InputStream in) {
            reader = new BufferedReader(
                    new InputStreamReader(in));
            tokenizer = new StringTokenizer("");
        }

        static String next() throws IOException {
            while (!tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(
                        reader.readLine());
            }
            return tokenizer.nextToken();
        }
        static int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
        static double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }
        static long nextLong() throws IOException {
            return Long.parseLong(next());
        }
    }
}