cities = ['kochi','Bangaluru','chennai','pune','mumbai']
populations = [80,96,56.6,67,77]
det={}


for city,population in zip(cities,populations):
    det[city]=population
print(det)        
