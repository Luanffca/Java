import numpy as np 
import math

f = lambda x: 4*math.sin(x)-math.e**x

inter = lambda a,b,erro: 1 + int((np.log(b-a)-np.log(erro))//np.log(2))

a,b,erro = 0,1,10**(-5)
k = inter(a,b,erro)

for i in range(k):
    
    x = b -f(b)*(a-b)/(f(a)-f(b))
    fb = float(f(b))
    fa =float(f(a))
    #print("Interação %d: x%d = %f (%f-%f) / %f - %f"  %(i,i,b,b,a,b,a,b))
    #print("Interação %d: x%d = %f (%f-%f) / %f - %f"  %(i, i , b , fb, a, b, fa, fb))
    print("Interação" , i , ": ", "x" , i ," = " , b ," - " , fb, " * C" , a , " - " , b ,"C/" , fa , " - ", fb ,"\n")
    if np.abs((x-b)/b)<erro:
        break
    
    a = b
    b = x 
    
print("Solução numérica: %f" %x)
print("Interações: %d" %i)