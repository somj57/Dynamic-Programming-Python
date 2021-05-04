n = int(input("Enter any number : "))
dp = [-1]*n

def fab(n):
  if dp[n] != -1:
    return dp[n]
  else:
    if n <=1:
      dp[n] = n
      return dp[n]
    else:
      dp[n] = fab(n-1) + fab(n-2)
      return dp[n]
  
for j in range(n):
  print(fab(j))

print("n th term :",fab(n-1))