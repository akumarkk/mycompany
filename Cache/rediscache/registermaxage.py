
def age(a):
  ''' Extracts the age from a person's record '''
  with open('/data/log.txt', 'a') as f:
    f.write(f"Processing key: {a}\n")
  print(f"Processing key: {a}")
  return int(a['value']['age'])

def compare_and_swap(x):
  ''' Checks and sets the current maximum '''
  with open('/data/log.txt', 'a') as f:
    f.write(f"Processing key: {x}\n")
  print(f"Key '{x}' updated !")
  k = 'age:maximum'
  v = execute('GET', k)   # read key's current value
  v = int(v) if v else 0  # initialize to 0 if None
  if x > v:               # if a new maximum found
    execute('SET', k, x)  # set key to new value

# Event handling function registration
gb = GearsBuilder()
gb.map(age) # Extract the 'age' field from each hash
gb.foreach(compare_and_swap) # Compare the max age to the value stored at age:maximum
gb.register('person:*')