from HELLO_DJANGO.dao_emp import DaoEmp
from HELLO_DJANGO.dao_member import DaoMember


de = DaoEmp()
lst = de.myselect()
print(lst)


de = DaoMember()
lst = de.myselect()
print(lst)