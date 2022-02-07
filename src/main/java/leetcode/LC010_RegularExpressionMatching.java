package leetcode;

public class LC010_RegularExpressionMatching {
	public static void main(String[] args) {
		// "mississippi"
		// "mis*is*ip*."
		String s = "mississippi";
		String p = "mis*is*ip*.";
		System.out.println(isMatch(s, p));
	}
	  public static boolean isMatch(String s, String p) {
	        if(s==null) s="";
			if(p==null||p.length()==0)return s.length()==0;
			return isMatch1(s,p,0,0); 
		}
		public static boolean isMatch1(String s, String p, int begin_i, int begin_j) {
			if(begin_i==s.length()) {
				if(begin_j>=p.length()) return true;
	            if(begin_j+1<p.length()){
	                if(p.charAt(begin_j+1)=='*'){
	                    return isMatch1(s,p,begin_i,begin_j+2);
	                }else{
	                    return false;
	                }
	            }else{
	                return false;
	            }
			}
			if(begin_j+1<p.length()) {
				if(p.charAt(begin_j+1)=='*') {
					if(isMatch1(s,p,begin_i,begin_j+2)==false){
						if(s.charAt(begin_i)!=p.charAt(begin_j)&&p.charAt(begin_j)!='.') {
							return false;
						}else {
							return isMatch1(s,p,begin_i+1,begin_j+2)||isMatch1(s,p,begin_i+1,begin_j);
						}
					}else {
						return true;
					}
				}else {
					if(s.charAt(begin_i)==p.charAt(begin_j)||p.charAt(begin_j)=='.') {
						return isMatch1(s,p,begin_i+1,begin_j+1);
					}else{
						return false;
					}
				}
			}else {
				if(begin_j>=p.length()) {
					return false;
				}else {
					//begin_j+1>=p.length
					if (p.charAt(begin_j) != s.charAt(begin_i)&&p.charAt(begin_j)!='.') {
						return false;
					}else {
						return begin_i+1==s.length();
					}
				}
			}
		}

}
