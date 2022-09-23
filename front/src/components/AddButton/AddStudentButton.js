import React ,{ useState } from 'react'

import { Button,Modal,Form,Input } from 'antd';

const AddStudentButton = () => {

    const [isModalOpen, setIsModalOpen] = useState(false);
    const [student, setStudent] = useState({
                                            firstname : "",
                                            lastname : "",
                                            email : ""
                                            })

    const showModal = () => {
        setIsModalOpen(true);
    };

    const handleOk = () => {
        const requestOptions = {
            method: 'POST',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify(student)
        };
        fetch('http://localhost:8080/api/student', requestOptions)
            .then(async response => {
                const data = await response.json();
    
                // check for error response
                if (!response.ok) {
                    // get error message from body or default to response status
                    const error = (data && data.message) || response.status;
                    return Promise.reject(error);
                }
    
            })
            .catch(error => {
                console.error('There was an error!', error);
            });
        setIsModalOpen(false);
    };

    const handleCancel = () => {
        setIsModalOpen(false);
    };

  return (
    <>
      <Button type="primary" onClick={showModal}>
        Open Modal
      </Button>
      <Modal title="Basic Modal" open={isModalOpen} onOk={handleOk} onCancel={handleCancel}>
            <Form
            name="basic"
            labelCol={{ span: 8 }}
            wrapperCol={{ span: 16 }}
            autoComplete="off"
            >
                <Form.Item
                    label="First Name"
                    name="firstname"
                    rules={[{ required: true }]}
                >
                    <Input placeholder= "Please input your first name!" 
                            onChange={((e)=>setStudent(Laststudent=>(
                                                                    {
                                                                        ...Laststudent,
                                                                        firstname: e.target.value,
                                                                    }
                                                                    )))}
                            value={student.firstname}
                                                                    />
                </Form.Item>
                <Form.Item
                    label="Last Name"
                    name="lastname"
                    rules={[{ required: true}]}
                >
                    <Input placeholder= 'Please input your last name!' 
                            onChange={((e)=>setStudent(Laststudent=>(
                                                                    {
                                                                        ...Laststudent,
                                                                        lastname: e.target.value,
                                                                    }
                                                                    )))}
                            value={student.lastname}
                    />
                </Form.Item>
                <Form.Item
                    label="Email"
                    name="email"
                    rules={[{ required: true, type: 'email' }]}
                >
                    <Input placeholder= 'Please input your email!'
                            onChange={((e)=>setStudent(Laststudent=>(
                                                                    {
                                                                        ...Laststudent,
                                                                        email: e.target.value,
                                                                    }
                                                                    )))}
                            value={student.email}
                    />
                </Form.Item>
            </Form>
      </Modal>
    </>
  )
}

export default AddStudentButton