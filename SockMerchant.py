#Sock Merchant problem in hackerrank 

def sockMerchant(n, ar):
    count = 0
    sets = set(ar)
    for i in sets:
        count += int(ar.count(i)/2)
    return count
