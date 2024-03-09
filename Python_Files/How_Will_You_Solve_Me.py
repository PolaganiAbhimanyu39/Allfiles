vowels=["a","e","i","o","u"]
def any_vowels(l):
    return list(filter(lambda word:any(letter in vowels for letter in word.lower()), words))
def histogram(l):
  output_list=[]
  unique_list=[]
  for i in l:
    if i not in unique_list:
      unique_list.append(i)
  for i in unique_list:
    count_is=l.count(i)
    output_list.append((i,count_is))
  for start in range(len(output_list)):
    pos=start
    while pos>0 and output_list[pos][1]<output_list[pos-1][1]:
      (output_list[pos-1],output_list[pos])=(output_list[pos],output_list[pos-1])
      pos=pos-1
  return output_list