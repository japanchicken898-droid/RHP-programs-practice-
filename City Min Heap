import java.util.*;
public class MinHeap {
	public static void main(String args[]) {
		PriorityQueue<int []> q=new PriorityQueue<>();
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		HashMap<Integer,List<int[]>> g=new HashMap<>();
		while(r-->0) {
		int src=sc.nextInt();
		int des=sc.nextInt();
		int dist=sc.nextInt();
		if(!g.containsKey(src)) {
			g.put(src, new ArrayList<>());
			
		
		g.get(src).add(new int[]{des,dist});
		}
		if(!g.containsKey(des)) {
			g.put(des, new ArrayList<>());
			g.get(des).add(new int[] {src,dist});
		}
		}
		int st=sc.nextInt();
		int end=sc.nextInt();
		PriorityQueue<int[]> pq=new PriorityQueue<>((x,y)->{return x[1]-y[1];});
		Set<Integer> visted=new HashSet<>();
		pq.add(new int[] {st,0});
		while(!pq.isEmpty()) {
			int []curr=pq.poll();
			int currcit=curr[0];
			int currdist=curr[1];
			if(currcit==end) {
				System.out.println(currdist);
				return;
		}
			if(visted.contains(currcit)) continue;
			visted.add(currcit);
			if(g.containsKey(currcit)) {
				for(int ocarr[]:g.get(currcit)) {
					int oc=ocarr[0];
					int ocd=ocarr[1];
					if(!visted.contains(oc)) {
						pq.add(new int[] {oc,ocd+currdist});
					}
				}
			}
		}
		}
		
	}
