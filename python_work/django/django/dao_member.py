import pymysql
from _ast import If

class DaoMember:
    
    def __init__(self):
        self.conn = pymysql.connect(host='localhost', user='root', password='python',
                       db='python',port=3305, charset='utf8')
        self.curs = self.conn.cursor(pymysql.cursors.DictCursor)


    def myselect(self):
        sql = """
        select
            m_id,
            m_name,
            mobile,
            up_date,
            in_date
        from member
        """
            
        self.curs.execute(sql)
        rows = self.curs.fetchall()
        return rows
    
    
    def myinsert(self,m_id,m_name,mobile):
        sql = f"""INSERT INTO member 
        (m_id,m_name,mobile,up_date,in_date)
        VALUES
        ('{m_id}','{m_name}','{mobile}',DATE_FORMAT(now(), '%Y%m%d'),DATE_FORMAT(now(), '%Y%m%d'))
        """
        cnt = self.curs.execute(sql)
        self.conn.commit()
        return cnt
    
    
    # def myupdate(self,m_id,m_name,mobile,up_date,in_date):
    #     sql = f"""
    #         UPDATE member
    #         SET
    #         m_name='{m_name}',
    #         mobile='{mobile}',
    #         up_date='{up_date}',
    #         in_date='{in_date}'
    #         WHERE
    #         m_id='{m_id}'
    #     """
    #     cnt = self.curs.execute(sql)
    #     self.conn.commit()
    #     return cnt  
    #
    # def mydelete(self,m_id,m_name,mobile,up_date,in_date):
    #     sql = f"""
    #         delete from member
    #         where 
    #         m_id={m_id}
    #     """
    #     cnt = self.curs.execute(sql)
    #     self.conn.commit()
    #     return cnt      
    #


        
    def __del__(self):
        self.curs.close()
        self.conn.close()
        
if __name__ == '__main__':
    de = DaoMember()
    # lst = de.myselect()
    # print(lst)
    #
    cnt = de.myinsert('3','3','3');
    print("cnt",cnt)
    
    