
- bigO 란?


 F(int[] n) {
    return (n[0] == 0) ? true:false;
 }
 
 이런 함수가 있다치면 데이터가 늘어나도 1번만에 처리가 가능하다
 O(1) 함수. 
 
 F(int[] n) {
    for i = 0 to n.length
        print i
 }
 
 n의 개수가 늘어남에따라 회수가 n번만큼 해야하기 때문에
 O(n) 함수.
 
 
 F(int[] n) {
    for i = 0 to n.length
        for j = 0 to n.length
            print i + j;
 }
 
 n을 n만큼 돌림.
 
 데이터가 1개늘어도 위아래로 한줄씩 늘어남.
 
 F(int[] n,int[] m) {
    for i = 0 to n.length
        for j = 0 to m.length
            print i + j;
 }
 
 m을 n만큼 돌림. 
 O(nm) 함수.
 
 
  F(int[] n) {
     for i = 0 to n.length
         for j = 0 to n.length
             for j = 0 to n.length
             print i + j + k;
          }
      }
  }
  
  피보나치 1,1,2,3,5,8 ...
  
  F(n, r) {
  if( n <= 0) return 0;
  else if (n == 1) return r[n] = 1;
  return r[n] = F(n - 1, r) + F(n - 2, r);
  } 
  
  O(2^)
  
  2진검색
  
  한번 처리할때마다 처리해야하는 배열이 반씩 뚝뚝 떨어지면
  O(logn)
  
  
  
  빅오 에서는 상수는 과감하게 버린다.
  
  F(int[] n) {
    for i = 0 to n.length
        print i
    for i = 0 to n.length
        print i
  }
  
  
  O(2n) 이지만 O(n)
  실제 알고리즘의 러닝타임을 재기위한것이 아니고.
  데이터의 크기에 따라 러닝타임의 증가율을 구하기 위한것이기 때문.
  
  
  
 
 
 
 
 
 

 
 
 
