# Panda is a high-level data manipulation tool.
dict = {"country": ["Brazil", "Russia", "India", "China", "South Africa"],
    "capital": ["Brasilia", "Moscow", "New Dehli", "Beijing", "Pretoria"],
    "area": [8.516, 17.10, 3.286, 9.597, 1.221],
    "population": [200.4, 143.5, 1252, 1357, 52.98] }

# panda has a key data structure called DataFrame

import pandas as pd
brics = pd.DataFrame(dict)
print(brics)

# The dictionary get converted to a class type DataFrame
print(type(brics))

# indexes are in representation of each row.
brics.index = ["BR", "RU", "IN", "CH", "SA"]

# Print out brics with new index values
print(brics)

# Import cars.csv data: cars
# You can create DataFrames by importing csv files using Pandas.
# pd.read_csv(<file name>, index_col = 0)


# Pandas Series
print(brics['country'])

# Pandas DataFrames
# Prints out country column as Pandas DataFrame
print(brics[['country']])

# Prints out country and capital column as Pandas DataFrame
print(brics[['country', 'capital']])


# Indexing Data Frames

# Print out first 3 observations
print(brics[0:2])
# Print out fifth, sixth, and seventh observation
print(brics[2:4])

# loc and iloc function
# loc - Prints out the specific index of the row
# THis needs double square brackets because it is printing out DataFrames
print(brics.loc[['CH', 'RU']])

# iloc - Prints out the specific rows and columns
print(brics.iloc[2])
