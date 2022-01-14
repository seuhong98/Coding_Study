import sys
def check():
    if thiscan:
        print("YES")
    else:
        print("NO")

just="99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999	99999"


thiscan=False
#sys.stdin.readline().rstrip()
tree = int(sys.stdin.readline().rstrip())
height=[]
for i in just.split("\t"):
    if (int(i)>0):
        height.append(int(i))
height.sort(reverse=True)
power=0
for where, i in enumerate(height):
    if not(i==0):
        if i>=2:
            if not(i%2==0):
                height[where] -= 3
            power = (i-3) / 2
            del height[where]
            if (power == 0):
                continue
            for b in height[::-1] :
                if b<=power:
                    power -=b
                    height.remove(b)
                    if power==0:
                        break
                else:
                    height[-1]=height[-1]-power
                    power=0
            if power>0:
                break
        else:
            thiscan=False

if len(height)==0 and power%3==0:
    thiscan=True
check()
