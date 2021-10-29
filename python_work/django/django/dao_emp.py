import pymysql
from _ast import If

class DaoEmp:
    
    def __init__(self):
        self.conn = pymysql.connect(host='localhost', user='root', password='python',
                       db='python',port=3305, charset='utf8')
 
        self.curs = self.conn.cursor(pymysql.cursors.DictCursor)


    def myselect(self):
        sql = "select * from emp"
        self.curs.execute(sql)
        rows = self.curs.fetchall()
        return rows
    
    
    def myinsert(self,emp_id,emp_name,tel,address):
        sql = f"INSERT INTO emp (emp_id,emp_name,tel,address) VALUES('{emp_id}','{emp_name}','{tel}','{address}')"
        cnt = self.curs.execute(sql)
        self.conn.commit()
        return cnt
    
    
    def myupdate(self,emp_id,emp_name, tel, address):
        sql = f"""
            UPDATE emp
            SET
            emp_name='{emp_name}',
            tel='{tel}',
            address='{address}'
            WHERE
            emp_id='{emp_id}'
        """
        cnt = self.curs.execute(sql)
        self.conn.commit()
        return cnt  
    
    def mydelete(self,emp_id,emp_name, tel, address):
        sql = f"""
            delete from emp
            where 
            emp_id={emp_id}
        """
        cnt = self.curs.execute(sql)
        self.conn.commit()
        return cnt      
     

        
    def __del__(self):
        self.curs.close()
        self.conn.close()
        
if __name__ == '__main__':
    de = DaoEmp()
    lst = de.myselect()
    print(lst)
    
    # cnt = de.myinsert('5','5','5','5');
    # print("cnt",cnt)
    #

    