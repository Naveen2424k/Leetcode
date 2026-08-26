class Solution:
    def resultArray(self, n: List[int]) -> List[int]:
        a1=[]
        a2=[]
        a1.append(n[0])
        a2.append(n[1])
        for i in range(2,len(n)):
            if a1[len(a1)-1]>a2[len(a2)-1]:
                a1.append(n[i])
            else:
                a2.append(n[i])
        
        a1.extend(a2)
        return a1
