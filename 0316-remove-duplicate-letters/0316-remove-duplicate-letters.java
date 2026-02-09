class Solution{
public String removeDuplicateLetters(String s){
int[] l=new int[26];boolean[] v=new boolean[26];char[] st=new char[26];int t=-1;
for(int i=0;i<s.length();i++)l[s.charAt(i)-97]=i;
for(int i=0;i<s.length();i++){char c=s.charAt(i);int x=c-97;if(v[x])continue;while(t>=0&&c<st[t]&&l[st[t]-97]>i)v[st[t--]-97]=false;st[++t]=c;v[x]=true;}
return new String(st,0,t+1);
}}
