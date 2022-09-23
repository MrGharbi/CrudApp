import {Table} from 'antd';
import React, {useEffect, useState} from 'react'
import AddStudentButton from '../AddButton/AddStudentButton';

const dataSource = [];
  
  const columns = [
    {
      title: 'UserId',
      dataIndex: 'userId',
      key: 'userid',
    },
    {
      title: 'First Name',
      dataIndex: 'firstName',
      key: 'firstname',
    },
    {
      title: 'Last Name',
      dataIndex: 'lastName',
      key: 'lastname',
    },
    {
      title: 'Email',
      dataIndex: 'email',
      key: 'email',
    },
  ];

const Studenttable = () => {

  const [data, setData] = useState([]);

  useEffect(() => {
    async function fetchData(){
      const response = await fetch('http://localhost:8080/api/student');
      const json = await response.json();
      setData(json);
      console.log(json);
    }
    fetchData();
  },[]);

  data.map(student => (
    dataSource.push({
      key : student.id,
      userId : student.id,
      firstName : student.firstname,
      lastName : student.lastname,
      email : student.email
    })
  ));


  return (
    <div>
      <Table dataSource={dataSource} columns={columns} />
      <AddStudentButton/>
    </div>
    
  )
}

export default Studenttable;