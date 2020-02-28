import React from 'react';



export const RoomTableComponent:React.FC<any> = (props:any) => {
    const [roomList, setRoomList] = useState([]);
    useEffect(() => {
        getRooms().then(r=>setRoomList(r.data));
    }, [roomList.length]);

    return (
        <div>
            <Table striped>
                <thead>
                    <tr>
                        <th>Room ID</th>
                        <th>Current Status</th>
                        <th>Room Number</th>
                        <th>Active</th>
                        <th>Max Occupancy</th>
                    </tr>
                </thead>
                <tbody>
                    {roomList.map((r:IRoom) => <RoomTableDisplay room={r}/>)}
                </tbody>
            </Table>

            <Link to='/'>Landing</Link>
        </div>
    )
}